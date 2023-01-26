package id.bootcamp.java310.pos.repositories;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import id.bootcamp.java310.pos.entities.tokenEntity;

public interface TokenRepository extends JpaRepository<tokenEntity, Long>{
	
	
	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "insert into token\r\n"
			+ "(created_by, token, email, is_expired, used_for, created_on, expired_on)\r\n"
			+ "values \r\n"
			+ "(1,:token,:email,false,:used_for, now(), :expired_on)")
	public void insertToken(
			@Param("token")String token,
			@Param("email")String email,
			@Param("used_for")String usedFor,
			@Param("expired_on")java.util.Date expiredOn);
	
	@Query(nativeQuery = true, value = "select exists (select * from (select email,\r\n"
			+ "count(*) as jumlah from token where email = :email\r\n"
			+ "group by email) t1\r\n"
			+ "where jumlah >= 10)")
	public Boolean isMaxOtp(@Param("email")String mail);
	
	@Query(nativeQuery = true, value = "--Cek apakah token sama\r\n"
			+ "select exists (select token \r\n"
			+ "from token where email = :email AND token = :otp\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpCorrect(@Param("email")String mail, @Param("otp")String otp);

	
	@Query(nativeQuery = true, value = "select exists (select created_on \r\n"
			+ "from token \r\n"
			+ "where email = :email \r\n"
			+ "AND token = :otp \r\n"
			+ "AND now() - expired_on > Interval '0' second\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpExpired(@Param("email")String mail, @Param("otp")String ackljasd);
}
