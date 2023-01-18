package id.bootcamp.java310.pos.dto;

public class UserDTO {
	private String email;
	private String password;
	private Long user_id;
	private String name;
	private String profile_picture;
	private String role_code;
	
	public UserDTO() {
		
	}

	public UserDTO(String email, Long user_id, String name, String profile_picture, String role_code) {
		super();
		this.email = email;
		this.user_id = user_id;
		this.name = name;
		this.profile_picture = profile_picture;
		this.role_code = role_code;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the profile_picture
	 */
	public String getProfile_picture() {
		return profile_picture;
	}

	/**
	 * @param profile_picture the profile_picture to set
	 */
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}

	/**
	 * @return the role_code
	 */
	public String getRole_code() {
		return role_code;
	}

	/**
	 * @param role_code the role_code to set
	 */
	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	
}
