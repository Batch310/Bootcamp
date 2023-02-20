package id.bootcamp.java310.katalogmobil.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PesanDTO {

	private Long id;
	private Long brand_id;
	private Long type_id;
	
}
