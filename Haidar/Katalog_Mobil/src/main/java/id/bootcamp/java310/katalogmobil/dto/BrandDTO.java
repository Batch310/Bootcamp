package id.bootcamp.java310.katalogmobil.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandDTO {

	private Long id;
	private String nama;
	
	public BrandDTO() {
		super();
	}
	
	public BrandDTO(Long id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}
	
}
