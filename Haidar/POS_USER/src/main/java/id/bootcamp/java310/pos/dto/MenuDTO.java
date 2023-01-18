package id.bootcamp.java310.pos.dto;

public class MenuDTO {
	private String name;
	private String url;
	
	public MenuDTO() {
		// TODO Auto-generated constructor stub
	}

	public MenuDTO(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
