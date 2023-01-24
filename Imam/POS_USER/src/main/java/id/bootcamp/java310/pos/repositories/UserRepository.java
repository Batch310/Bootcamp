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

	// UPDATE SAVE USER
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "update m_user\r\n" + "set email = :email, password = :password\r\n"
			+ "where id = :user_id")
	public void saveUser(@Param("email") String email, @Param("password") String password,
			@Param("user_id") Long userId);
	
	@Query(nativeQuery = true,
			value =" select exists (select email from m_user\r\n"
					+ "				where email = :email)")
	public Boolean checkEmailExists(@Param("email") String mail);
	
	//INSERT ROLE REGISTER BIODATA
	@Query(nativeQuery = true, value = "insert into m_user\r\n"
				+ "(email, password, role_id, biodata_id, created_by, created_on)\r\n"
				+ "values\r\n"
				+ "(:email, :password, :role_id, :biodata_id, 1, now())")
	public Long saveUserRegister(@Param("email") String mail,
				@Param("password") String password,
				@Param("role_id") Long roleId,
				@Param("biodata_id") Long biodataId);
	
}


