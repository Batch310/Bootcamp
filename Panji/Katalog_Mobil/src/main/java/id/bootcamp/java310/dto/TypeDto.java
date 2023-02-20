package id.bootcamp.java310.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDto {

	private Long id;
	private String harga;
	private Long brand_id;
	private String type;
	private String tahun;
	private String url_image1;
	private String url_image2;
	
	public TypeDto() {
		// TODO Auto-generated constructor stub
	}
	
	public TypeDto(Long id, String harga, Long brand_id, String type, String tahun, String url_image1,
			String url_image2) {
		super();
		this.id = id;
		this.harga = harga;
		this.brand_id = brand_id;
		this.type = type;
		this.tahun = tahun;
		this.url_image1 = url_image1;
		this.url_image2 = url_image2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHarga() {
		return harga;
	}
	public void setHarga(String harga) {
		this.harga = harga;
	}
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTahun() {
		return tahun;
	}
	public void setTahun(String tahun) {
		this.tahun = tahun;
	}
	public String getUrl_image1() {
		return url_image1;
	}
	public void setUrl_image1(String url_image1) {
		this.url_image1 = url_image1;
	}
	public String getUrl_image2() {
		return url_image2;
	}
	public void setUrl_image2(String url_image2) {
		this.url_image2 = url_image2;
	}
	
	
}
