package id.bootcamp.java310.katalogmobil.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDTO {

	private Long id;
	private Long brand_id;
	private String nama_brand;
	private String nama;
	private String tahun;
	private String harga;
	private String kapasitas_kursi;
	private String bahan_bakar;
	private String transmisi;
	private String url_foto_kecil;
	private String url_foto_besar;
	
	public TypeDTO() {
		super();
	}

	//Search
	public TypeDTO(Long id, String nama) {
		super();
		this.id = id;
		this.nama = nama;
	}
	
	//Landing Page
	public TypeDTO(Long id, Long brand_id, String nama_brand, String nama, String tahun, String harga,
			String url_foto_kecil) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.nama_brand = nama_brand;
		this.nama = nama;
		this.tahun = tahun;
		this.harga = harga;
		this.url_foto_kecil = url_foto_kecil;
	}

	//Detail
	public TypeDTO(Long id, Long brand_id, String nama_brand, String nama, String tahun, String harga,
			String kapasitas_kursi, String bahan_bakar, String transmisi, String url_foto_besar) {
		super();
		this.id = id;
		this.brand_id = brand_id;
		this.nama_brand = nama_brand;
		this.nama = nama;
		this.tahun = tahun;
		this.harga = harga;
		this.kapasitas_kursi = kapasitas_kursi;
		this.bahan_bakar = bahan_bakar;
		this.transmisi = transmisi;
		this.url_foto_besar = url_foto_besar;
	}
	
}
