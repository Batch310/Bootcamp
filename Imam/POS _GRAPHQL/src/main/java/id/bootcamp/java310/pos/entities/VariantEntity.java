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

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonFormat;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;

@NamedNativeQueries( value = {
		@NamedNativeQuery (
		name = "get_variant",
		query = "select \r\n"
				+ "	v.id,\r\n"
				+ "	v.category_id,\r\n"
				+ "	c.name as \"category name\",\r\n"
				+ "	v.initial,\r\n"
				+ "    v.name,\r\n"
				+ "	v.active\r\n"
				+ "from variant v\r\n"
				+ "inner join category c\r\n"
				+ " on v.category_id=c.id\r\n"
				+ "order by initial asc",
		resultSetMapping ="get_variant_result"
		),
		@NamedNativeQuery (
				name = "search_variant",
				query = "select \r\n"
						+ "	v.id,\r\n"
						+ "	v.category_id,\r\n"
						+ "	c.name as \"category_name\",\r\n"
						+ "	v.initial,\r\n"
						+ "    v.name,\r\n"
						+ "	v.active\r\n"
						+ "from variant v\r\n"
						+ "inner join category c\r\n"
						+ " on v.category_id=c.id\r\n"
						+ "where v.name ilike '%'|| :keyword||'%'\r\n"
						+ "order by initial asc",
				resultSetMapping ="get_variant_result"
				),
		@NamedNativeQuery (
				name = "pagination_variant",
				query = "select\r\n"
						+ "	v.id,\r\n"
						+ "	v.category_id,\r\n"
						+ "	c.name as \"category_name\",\r\n"
						+ "	v.initial,\r\n"
						+ "    v.name,\r\n"
						+ "	v.active\r\n"
						+ "from variant v\r\n"
						+ "inner join category c\r\n"
						+ "	on v.category_id=c.id\r\n"
						+ "where v.name ilike '%'|| :keyword||'%'\r\n"
						+ "order by id asc\r\n"
						+ "limit :limit\r\n"
						+ "offset :offset",
				resultSetMapping ="get_variant_result"
				)
			
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
		name ="get_variant_result",
		classes = @ConstructorResult(
				targetClass = VariantDTO.class,
				columns = {
						
						               //harus sama nama kolom
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "category_id", type = Long.class),
						@ColumnResult(name = "category_name", type = String.class),
						@ColumnResult(name = "initial", type = String.class),
						@ColumnResult(name = "name", type = String.class),
						@ColumnResult(name = "active", type = Boolean.class),
				}
				)
			
			)	
})
@Entity
@Table(name ="variant")
public class VariantEntity {
	
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne   //dilihat dari sisi tabel variant
	@JoinColumn(name="category_id", insertable=false, updatable = false)
	private CategoryEntity category;
	
	//join pengunci (ON)
	@Column(name="category_id",nullable = false)
	private Long categoryId;
	
	@Column(length = 10, nullable = false,unique = true)
	private String initial;
	
	@Column(length = 50, nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Boolean active;
	
	@Column(name="create_by",length = 50, nullable = false)
	private String createBy;
	
	@Column(name="create_date",nullable = false)
	@JsonFormat(pattern ="dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date createDate;
	
	@Column(name = "modify_by", length = 50, nullable = true)
	private String modifyBy;
	
	@Column(name="modify_date",nullable = true)
	@JsonFormat(pattern ="dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date modifyDate;

	public Long getId() {
		return id;
	}
	
	

	public CategoryEntity getCategory() {
		return category;
	}



	public void setCategory(CategoryEntity category) {
		this.category = category;
	}



	public void setId(Long id) {
		this.id = id;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	
	
	
	
	

}
