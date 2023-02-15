package id.acc.landingpage.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PesananDTO {
	private Long id;
	private Long brand_id;
	private Long type_id;

	public PesananDTO() {

	}

	public PesananDTO(Long id, Long brand_id, Long type_id) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.type_id = type_id;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the brand_id
	 */
	public Long getBrand_id() {
		return brand_id;
	}

	/**
	 * @param brand_id the brand_id to set
	 */
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}

	/**
	 * @return the type_id
	 */
	public Long getType_id() {
		return type_id;
	}

	/**
	 * @param type_id the type_id to set
	 */
	public void setType_id(Long type_id) {
		this.type_id = type_id;
	}
	
	

}
