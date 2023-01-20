package id.bootcamp.java310.pos.entities;

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

import id.bootcamp.java310.pos.dto.VariantDTO;

@NamedNativeQueries(value = {
		@NamedNativeQuery(
				name = "search_name_variant",
				query = "select \r\n"
						+ "        v.id,\r\n"
						+ "        v.category_id,\r\n"
						+ "        c.name as category_name,\r\n"
						+ "        v.initial,\r\n"
						+ "        v.name,\r\n"
						+ "        v.active\r\n"
						+ "from variant v\r\n"
						+ "join category c\r\n"
						+ "        on v.category_id = c.id\r\n"
						+ "where v.name ilike '%' || :keyword || '%'\r\n"
						+ "order by initial asc",
				resultSetMapping = "get_variant"),
		@NamedNativeQuery(
				name = "pagination_variant",
				query = "select \r\n"
						+ "        v.id,\r\n"
						+ "        v.category_id,\r\n"
						+ "        c.name as category_name,\r\n"
						+ "        v.initial,\r\n"
						+ "        v.name,\r\n"
						+ "        v.active\r\n"
						+ "from variant v\r\n"
						+ "join category c\r\n"
						+ "        on v.category_id = c.id\r\n"
						+ "where is_delete = false and v.name ilike '%' || :keyword || '%'\r\n"
						+ "order by id asc\r\n"
						+ "limit :limit\r\n"
						+ "offset :offset",
				resultSetMapping = "get_variant"
				)
		})

@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
				name = "get_variant",
				classes = @ConstructorResult(
						targetClass = VariantDTO.class,
						columns = {
								@ColumnResult(name = "id",type = Long.class),
								@ColumnResult(name = "category_id",type = Long.class),
								@ColumnResult(name = "category_name",type = String.class),
								@ColumnResult(name = "initial",type = String.class),
								@ColumnResult(name = "name",type = String.class),
								@ColumnResult(name = "active",type = Boolean.class)
						}))
})


@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "variant") // Menamakan Tabel
public class VariantEntity extends BaseProperties {

	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;

	@ManyToOne
	@JoinColumn(name = "category_id", insertable = false, updatable = false)
	private CategoryEntity category;

	@Column(name = "category_id", nullable = false)
	private Long categoryId;

	@Column(length = 10, nullable = false, unique = true)
	private String initial;

	@Column(length = 50, nullable = false, unique = true)
	private String name;

	@Column(nullable = false)
	private Boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CategoryEntity getCategoryEntity() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
}
