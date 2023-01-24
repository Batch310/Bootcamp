package id.bootcamp.java310.pos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	@Query(nativeQuery = true, name = "login_query")
	public UserDTO login(
			@Param("email") String email,
			@Param("password") String password);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update m_user\r\n"
			+ "set email = :email, password = :password\r\n"
			+ "where id = :user_id")
	public void updateUser(@Param("user_id") Long userId,
			@Param("email") String email,@Param("password") String password);
	
	@Query(nativeQuery = true, value ="select * from m_user where email = :email")
	public UserEntity getUserByEmail(@Param("email") String mail);
	
	@Query(nativeQuery = true, value ="select r.code from m_user u join role r on u.role_id = r.id where u.email = :email")
	public String getRoleCodebyEmail(@Param("email") String mail);
	
}