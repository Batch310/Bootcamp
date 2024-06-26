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
	@Query(nativeQuery = true, value = "INSERT INTO public.token(\r\n"
			+ "	created_by, email, is_expired, token, used_for, created_on, expired_on)\r\n"
			+ "	VALUES (1, :email, false, :token, :used_for, now(), :expired_on)")
	public void insertToken(
			@Param("token") String token, 
			@Param("email") String email, 
			@Param("used_for") String usedFor, 
			@Param("expired_on") Date expiredOn);
	
	// Max jumlah otp terkirim dalam 1 email
	@Query(nativeQuery = true, value = "SELECT EXISTS\r\n"
			+ "	(SELECT *\r\n"
			+ "		FROM\r\n"
			+ "			(SELECT EMAIL,\r\n"
			+ "					COUNT(*) AS JUMLAH\r\n"
			+ "				FROM TOKEN\r\n"
			+ "				WHERE EMAIL = :email\r\n"
			+ "				GROUP BY EMAIL)T1\r\n"
			+ "		WHERE JUMLAH >= 10)")
	public Boolean isMaxOtp(@Param("email") String email);

	@Query(nativeQuery = true, value = "select exists (select token \r\n"
			+ "from token where email = :email AND token = :otp\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpCorrect(String email, String otp);

	@Query(nativeQuery = true, value = "select exists (select created_on \r\n"
			+ "from token \r\n"
			+ "where email = :email \r\n"
			+ "AND token = :otp\r\n"
			+ "AND now() - expired_on > Interval '0' second\r\n"
			+ "order by created_on desc\r\n"
			+ "limit 1)")
	public Boolean isOtpExpired(String email, String otp);
}
