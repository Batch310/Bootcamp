package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import id.bootcamp.java310.pos.dto.UserDTO;

@NamedNativeQueries(value = { @NamedNativeQuery(name = "login_query", query = "select \r\n"
		+ "        u.email,\r\n" + "        u.id as user_id,\r\n" + "        b.fullname as name,\r\n"
		+ "        b.image_path as profile_picture,\r\n" + "        r.code as role_code\r\n" + "from m_user u \r\n"
		+ "join biodata b\r\n" + "        on u.biodata_id = b.id\r\n" + "join role r\r\n"
		+ "        on u.role_id = r.id\r\n"
		+ "where u.email = :email AND password = :password", resultSetMapping = "login_result") })
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "login_result", classes = @ConstructorResult(targetClass = UserDTO.class, columns = {
				@ColumnResult(name = "email", type = String.class), @ColumnResult(name = "user_id", type = Long.class),
				@ColumnResult(name = "name", type = String.class),
				@ColumnResult(name = "profile_picture", type = String.class),
				@ColumnResult(name = "role_code", type = String.class), })) })

@Entity
@Table(name = "m_user")
public class UserEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@OneToOne
	@JoinColumn(name = "biodata_id", insertable = false, updatable = false)
	private BiodataEntity biodata;

	private Long biodata_id;

	@OneToOne
	@JoinColumn(name = "role_id", insertable = false, updatable = false)
	private RoleEntity role;

	private Long role_id;

	@Column(length = 100)
	private String email;

	@Column(length = 255)
	private String password;

	private Integer login_attempt;

	private Boolean is_locked;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date last_login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BiodataEntity getBiodata() {
		return biodata;
	}

	public void setBiodata(BiodataEntity biodata) {
		this.biodata = biodata;
	}

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public Long getBiodata_id() {
		return biodata_id;
	}

	public void setBiodata_id(Long biodata_id) {
		this.biodata_id = biodata_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getLogin_attempt() {
		return login_attempt;
	}

	public void setLogin_attempt(Integer login_attempt) {
		this.login_attempt = login_attempt;
	}

	public Boolean getIs_locked() {
		return is_locked;
	}

	public void setIs_locked(Boolean is_locked) {
		this.is_locked = is_locked;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
}
