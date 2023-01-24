package id.bootcamp.java310.pos.dto;

public class UserDTO {
	private String email;
	private String password;
	private Long user_id;
	private String name;
	private String profile_picture;
	private String role_code;
	
	//Username & password untuk Basic Auth
	private String usernameAuth;
	private String passwordAuth;
	
	public String getEmail() {
		return email;
	}
	
	public UserDTO() {
		// TODO Auto-generated method stub

	}
	
	public UserDTO(String email, Long user_id, String name, String profile_picture, String role_code) {
		super();
		this.email = email;
		this.user_id = user_id;
		this.name = name;
		this.profile_picture = profile_picture;
		this.role_code = role_code;
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
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getRole_code() {
		return role_code;
	}
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getUsernameAuth() {
		return usernameAuth;
	}

	public void setUsernameAuth(String usernameAuth) {
		this.usernameAuth = usernameAuth;
	}

	public String getPasswordAuth() {
		return passwordAuth;
	}

	public void setPasswordAuth(String passwordAuth) {
		this.passwordAuth = passwordAuth;
	}
	
}
