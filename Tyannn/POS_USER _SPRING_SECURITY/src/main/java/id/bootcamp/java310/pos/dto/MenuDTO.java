package id.bootcamp.java310.pos.dto;

public class MenuDTO {
	String name;
	String url;
	
	public MenuDTO() {
		
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
