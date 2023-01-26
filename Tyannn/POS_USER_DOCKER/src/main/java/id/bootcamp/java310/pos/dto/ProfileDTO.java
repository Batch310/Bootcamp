package id.bootcamp.java310.pos.dto;

public class ProfileDTO {
	private Long user_id;
	private String fullname;
	private String phone;
	private String email;
	private String password;
	private String picture;
	private String role_name;
	
	
	public ProfileDTO() {
		
	}
	
	public ProfileDTO(Long user_id, String fullname, String phone, String email, String password, String picture,
			String role_name) {
		super();
		this.user_id = user_id;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.picture = picture;
		this.role_name = role_name;
	}
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	
	

}
