package id.bootcamp.java310.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandDto {

	private Long id;
	private String name;
	private String url_image;
	
	public BrandDto() {
		
	}
	
	

	public BrandDto(Long id, String name, String url_image) {
		super();
		this.id = id;
		this.name = name;
		this.url_image = url_image;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl_image() {
		return url_image;
	}

	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}
	
	
	
}
