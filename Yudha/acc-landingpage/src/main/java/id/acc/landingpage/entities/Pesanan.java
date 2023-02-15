package id.acc.landingpage.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "pesanan") // Menamakan Tabel
public class Pesanan {

	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	
	private Long brand_id;
	private Long type_id;
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
