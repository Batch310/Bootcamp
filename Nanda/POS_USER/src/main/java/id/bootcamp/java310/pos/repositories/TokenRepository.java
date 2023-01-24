package id.bootcamp.java310.pos.repositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.entities.TokenEntity;

public interface TokenRepository extends JpaRepository<TokenEntity, Long> {

	@Modifying
	@Transactional
	@Query(nativeQuery = true,
			value = "insert into token\r\n"
					+ "(created_by, token, email, is_expired, used_for, created_on, expired_on)\r\n"
					+ "values \r\n"
					+ "(1,:token,:email,false,:used_for,now(),:expired_on")
	public void insertToken(@Param("token") String token,
			@Param("email") String email,
			@Param("used_for") String pakai,
			@Param("expired_on") Date expired);
	
	@Query(nativeQuery = true, value = "select exists (select * from (select email,\r\n"
			+ "count(*) as jumlah from token where email = :email\r\n"
			+ "group by email) t1\r\n"
			+ "where jumlah >= 10)")
	public Boolean isMaxOtp(@Param("email") String email);
	
	@Query(nativeQuery = true, value = "select exists (select token \r\n"
			+ "from token where email = :email AND token = :otp\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpCorrect(@Param("email") String email, @Param("otp") String otp);
	
	@Query(nativeQuery = true, value = "select exists (select created_on \r\n"
			+ "from token \r\n"
			+ "where email = :email \r\n"
			+ "AND token = :otp\r\n"
			+ "AND now() - expired_on > Interval '0' second\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpExp(@Param("email") String email, @Param("otp") String otp);
	
	
	
	
	
	
}
