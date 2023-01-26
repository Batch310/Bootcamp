package id.bootcamp.java310.pos.entities;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import id.bootcamp.java310.pos.dto.ProfileDTO;


@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "profile_query", query = 
				"select\r\n"
				+ "        u.id as user_id,\r\n"
				+ "        b.fullname,\r\n"
				+ "        b.mobile_phone as phone,\r\n"
				+ "        u.email,\r\n"
				+ "        u.password,\r\n"
				+ "        b.image_path as picture,\r\n"
				+ "        r.name as role_name\r\n"
				+ "from m_user u\r\n"
				+ "join biodata b\r\n"
				+ "        on b.id = u.biodata_id\r\n"
				+ "join role r\r\n"
				+ "        on r.id = u.role_id\r\n"
				+ "where u.id = :user_id", 
				resultSetMapping = "profile_result") })
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "profile_result", classes = @ConstructorResult(targetClass = ProfileDTO.class, columns = {
				@ColumnResult(name = "user_id", type = Long.class),
				@ColumnResult(name = "fullname", type = String.class),
				@ColumnResult(name = "phone", type = String.class),
				@ColumnResult(name = "email", type = String.class),
				@ColumnResult(name = "password", type = String.class),
				@ColumnResult(name = "picture", type = String.class),
				@ColumnResult(name = "role_name", type = String.class)
				})) })


@Entity
@Table(name = "biodata")
public class BiodataEntity extends BaseProperties {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 255)
	private String fullname;
	
	@Column(length = 15)
	private String mobile_phone;
	
	@Lob
	private Byte[] image;
	
	@Column(length = 255)
	private String image_name;
	
	@Column(length = 255)
	private String image_path;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getMobile_phone() {
		return mobile_phone;
	}

	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}

	public Byte[] getImage() {
		return image;
	}

	public void setImage(Byte[] image) {
		this.image = image;
	}

	public String getImage_name() {
		return image_name;
	}

	public void setImage_name(String image_name) {
		this.image_name = image_name;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
}
