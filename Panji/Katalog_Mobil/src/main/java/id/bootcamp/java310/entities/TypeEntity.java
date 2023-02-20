package id.bootcamp.java310.entities;

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

import id.bootcamp.java310.dto.TypeDto;

@NamedNativeQueries(value = {
		@NamedNativeQuery(
				name = "get_type",
				query = "select * from tabel_type",
				resultSetMapping = "get_type_result")
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
				name = "get_type_result",
				classes = @ConstructorResult(
						targetClass = TypeDto.class,
						columns = {
								@ColumnResult(name = "id", type = Long.class),
								@ColumnResult(name = "harga", type = String.class),
								@ColumnResult(name = "brand_id", type = Long.class),
								@ColumnResult(name = "type", type = String.class),
								@ColumnResult(name = "tahun", type = String.class),
								@ColumnResult(name = "url_image1", type = String.class),
								@ColumnResult(name = "url_image2", type = String.class),
						}))
})

@Entity
@Table(name = "tabel_type")
public class TypeEntity {

	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	
	private String harga;
	
	@ManyToOne
	@JoinColumn(name = "brand_id", insertable = false, updatable = false)
	private BrandEntity brand;
	
	@Column(name = "brand_id", nullable = false)
	private Long brand_id;
	
	private String type;
	
	private String tahun;
	
	private String url_image1;
	
	private String url_image2;

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

	public BrandEntity getBrand() {
		return brand;
	}

	public void setBrand(BrandEntity brand) {
		this.brand = brand;
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
