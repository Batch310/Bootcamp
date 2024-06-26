package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	@Query(nativeQuery = true, name = "login_query")
	public UserDTO login(@Param("email") String email, @Param("password") String password);

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update m_user\r\n" + "set email = :email, password = :password\r\n"
			+ "where id = :user_id")
	public void updateUser(@Param("email") String email, @Param("password") String password,
			@Param("user_id") Long userId);

	@Query(nativeQuery = true, value = "select exists (select email from m_user where email = :email)")
	public Boolean isEmailExists(@Param("email") String email);

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "insert into m_user\r\n"
			+ "(email, password, role_id, biodata_id, created_by, created_on)\r\n" + "values\r\n"
			+ "(:email, :password, :role_id, :biodata_id, 1, now())")
	public void saveUserRegister(@Param("email") String email, @Param("password") String password,
			@Param("role_id") Long role_id, @Param("biodata_id") Long biodata_id);
}
