package id.acc.landingpage.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.dto.TypeDTO;



@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "get_type", query = "select * from type", resultSetMapping = "get_type_result"),
		 })
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "get_type_result", classes = @ConstructorResult(targetClass = TypeDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class),
				@ColumnResult(name = "brand_id", type = Long.class),
				@ColumnResult(name = "name", type = String.class),
				@ColumnResult(name = "harga", type = Long.class),
				@ColumnResult(name = "tahun", type = String.class),
				@ColumnResult(name = "url_gambar_kecil", type = String.class),
				@ColumnResult(name = "url_gambar_besar", type = String.class),
				@ColumnResult(name = "kapasitas_kursi", type = Long.class),
				@ColumnResult(name = "bahan_bakar", type = String.class),
				@ColumnResult(name = "transmisi", type = String.class),
		})) })
@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "type") // Menamakan Tabel
public class Type {

	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;

	@ManyToOne
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private Brand brand;

	@Column(name = "brand_id", nullable = false)
	private Long brand_id;

	private String name;
	
	private Long harga;

	private String tahun;
	
	private String url_gambar_kecil;
	
	private String url_gambar_besar;
	
	private Long kapasitas_kursi;
	
	private String bahan_bakar;
	
	private String transmisi;

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
	 * @return the brand
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(Brand brand) {
		this.brand = brand;
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
	 * @return the harga
	 */
	public Long getHarga() {
		return harga;
	}

	/**
	 * @param harga the harga to set
	 */
	public void setHarga(Long harga) {
		this.harga = harga;
	}

	/**
	 * @return the tahun
	 */
	public String getTahun() {
		return tahun;
	}

	/**
	 * @param tahun the tahun to set
	 */
	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	/**
	 * @return the url_gambar_kecil
	 */
	public String getUrl_gambar_kecil() {
		return url_gambar_kecil;
	}

	/**
	 * @param url_gambar_kecil the url_gambar_kecil to set
	 */
	public void setUrl_gambar_kecil(String url_gambar_kecil) {
		this.url_gambar_kecil = url_gambar_kecil;
	}

	/**
	 * @return the url_gambar_besar
	 */
	public String getUrl_gambar_besar() {
		return url_gambar_besar;
	}

	/**
	 * @param url_gambar_besar the url_gambar_besar to set
	 */
	public void setUrl_gambar_besar(String url_gambar_besar) {
		this.url_gambar_besar = url_gambar_besar;
	}

	/**
	 * @return the kapasitas_kursi
	 */
	public Long getKapasitas_kursi() {
		return kapasitas_kursi;
	}

	/**
	 * @param kapasitas_kursi the kapasitas_kursi to set
	 */
	public void setKapasitas_kursi(Long kapasitas_kursi) {
		this.kapasitas_kursi = kapasitas_kursi;
	}

	/**
	 * @return the bahan_bakar
	 */
	public String getBahan_bakar() {
		return bahan_bakar;
	}

	/**
	 * @param bahan_bakar the bahan_bakar to set
	 */
	public void setBahan_bakar(String bahan_bakar) {
		this.bahan_bakar = bahan_bakar;
	}

	/**
	 * @return the transmisi
	 */
	public String getTransmisi() {
		return transmisi;
	}

	/**
	 * @param transmisi the transmisi to set
	 */
	public void setTransmisi(String transmisi) {
		this.transmisi = transmisi;
	}

	
}
