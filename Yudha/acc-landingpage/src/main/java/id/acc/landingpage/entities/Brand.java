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

import id.acc.landingpage.dto.BrandDTO;

@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "get_brand", query = "select * from brand", resultSetMapping = "get_brand_result"),
		 })
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "get_brand_result", classes = @ConstructorResult(targetClass = BrandDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class),
				@ColumnResult(name = "name", type = String.class)})) })
@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "brand") // Menamakan Tabel
public class Brand {

	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	
	private String name;

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
	
	
	
}
