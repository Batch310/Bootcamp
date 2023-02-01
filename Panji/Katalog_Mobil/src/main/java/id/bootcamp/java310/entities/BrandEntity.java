package id.bootcamp.java310.entities;

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

import id.bootcamp.java310.dto.BrandDto;

@NamedNativeQueries(value = {
		@NamedNativeQuery(
				name = "get_brands",
				query = "select * from tabel_brand",
				resultSetMapping = "get_brands_result")
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
				name = "get_brands_result",
				classes = @ConstructorResult(
						targetClass = BrandDto.class,
						columns = {
								@ColumnResult(name = "id", type = Long.class),
								@ColumnResult(name = "name", type = String.class),
								@ColumnResult(name = "url_image", type = String.class)
								
						}))
})

@Entity
@Table(name = "tabel_brand")
public class BrandEntity {
	
	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	
	@Column(length = 50, nullable = false, unique = true)
	private String name;
	
	private String url_image;

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
