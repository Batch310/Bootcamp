package id.bootcamp.java310.pos.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
	@Query(nativeQuery = true, name = "login_query")
	public UserDTO login(@Param("email") String email, @Param("password") String password);
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update m_user\r\n"
			+ "set email = :email, password = :password\r\n"
			+ "where id = :user_id")
	public void updateBiodataUser(@Param("email") String email, @Param("password") String passwotd, @Param("user_id") Long id);
	
	@Query(nativeQuery = true, value = "select exists (select email from m_user where email = :email")
	public Boolean checkEmailExists(@Param("email") String mail);
	
	@Query(nativeQuery = true, value = "select exists (select token \r\n"
			+ "from token where email = :email AND token = :otp\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isMaxOtp(@Param("email") String email, @Param("otp") String otp);
	
	@Query(nativeQuery = true, value = "select exists (select created_on \r\n"
			+ "from token \r\n"
			+ "where email = :email \r\n"
			+ "AND token = :otp\r\n"
			+ "AND now() - expired_on > Interval '0' second\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpExpired(@Param("email") String email, @Param("otp") String otp);
	
	@Query(nativeQuery = true, value = "insert into m_user\r\n"
			+ "(email, password, role_id, biodata_id, created_by, created_on)\r\n"
			+ "values\r\n"
			+ "(:email, :password, :role_id, :biodata_id, 1, now())")
	public Long savUserRegister(
			@Param("email") String email, 
			@Param("password") String password, 
			@Param("role_id") Long roleId, 
			@Param("biodata_id") Long biodataId);
}
