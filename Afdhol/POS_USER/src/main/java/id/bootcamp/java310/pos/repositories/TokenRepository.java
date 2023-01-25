package id.bootcamp.java310.pos.repositories;



import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import id.bootcamp.java310.pos.entities.TokenEntity;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Long>{

	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, 
		value = "insert into token\r\n"
				+ "(created_by, token, email, is_expired, used_for, created_on, expired_on)\r\n"
				+ "values \r\n"
				+ "(1,"
				+ ":token,"
				+ ":email,"
				+ "false,"
				+ ":used_for,"
				+ "now(),"
				+ ":expired_on)"
				)
	public void inserToken(@Param ("token") String token,
			@Param ("email") String mail,
			@Param ("used_for") String used_for,
			@Param ("expired_on") Date exp_on);
	
	
	@Query(nativeQuery = true, 
		value = "select exists (select * from (select email,\r\n"
				+ "count(*) as jumlah from token where email = :email\r\n"
				+ "group by email) t1\r\n"
				+ "where jumlah >= 10)")
	public Boolean isMaxOTP(@Param("email") String mail);
	
	

	@Query(nativeQuery = true, 
		value = "select exists (select token \r\n"
				+ "from token where email = :email AND token = :otp\r\n"
				+ "order by created_on desc\r\n"
				+ "limit 1)")
	public Boolean isOTPCorrect (@Param ("email") String mail,
								@Param ("otp") String otp );

	@Query(nativeQuery = true, 
		value = "select exists (select created_on \r\n"
				+ "from token \r\n"
				+ "where email = :email \r\n"
				+ "AND token = :otp\r\n"
				+ "AND now() - expired_on > Interval '0' second\r\n"
				+ "order by created_on desc\r\n"
				+ "limit 1)")
	
	public Boolean isOTPExpired(@Param ("email") String mail,
			@Param ("otp") String otp );
}
