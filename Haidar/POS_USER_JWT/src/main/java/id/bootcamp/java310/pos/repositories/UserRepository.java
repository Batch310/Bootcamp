package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.UserEntity;


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
	public void updateEmailPassword(@Param("email") String email,
			@Param("password") String password,
			@Param("user_id") Long userId);
	
	@Query(nativeQuery = true, 
			value = "SELECT * FROM M_USER WHERE EMAIL = :email")
	public UserEntity getUserByEmail(@Param("email") String email);

	@Query(nativeQuery = true, 
			value = "SELECT\r\n"
			+ "	R.CODE\r\n"
			+ "FROM M_USER U\r\n"
			+ "INNER JOIN ROLE R\r\n"
			+ "	ON U.ROLE_ID = R.ID\r\n"
			+ "WHERE U.EMAIL = :email")
	public String getRoleCodeByEmail(@Param("email") String email);
	
}
