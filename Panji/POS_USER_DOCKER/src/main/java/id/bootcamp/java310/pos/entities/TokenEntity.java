package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "token")
public class TokenEntity extends BaseProperties{

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100)
	private String email;
	
	private Long user_id;
	
	@Column(length = 50)
	private String token;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm",timezone = "Asia/Jakarta")
	private Date expired_on;
	
	private Boolean is_expired;
	
	@Column(length = 20)
	private String used_for;
}
