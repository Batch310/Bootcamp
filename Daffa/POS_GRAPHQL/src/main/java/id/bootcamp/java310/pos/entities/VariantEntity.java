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
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import id.bootcamp.java310.pos.dto.VariantDTO;

@NamedNativeQuery(name = "search_variant", query = "select variant.id, category_id, category.name as category_name, variant.initial, variant.name, variant.active from variant\r\n"
		+ "join category on variant.category_id = category.id " + "where variant.name ilike '%'|| :keyword ||'%'\r\n"
		+ "order by id asc", resultSetMapping = "get_variant")
@NamedNativeQuery(name = "pagination_variant", query = "select variant.id, category_id, category.name as category_name, variant.initial, variant.name, variant.active from variant\r\n"
		+ "join category on variant.category_id = category.id " + "where variant.name ilike '%'|| :keyword ||'%'\r\n"
		+ "order by id asc " + "limit :limit " + "offset :offset", resultSetMapping = "get_variant")
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(name = "get_variant", classes = @ConstructorResult(targetClass = VariantDTO.class, columns = {
				@ColumnResult(name = "id", type = Long.class), @ColumnResult(name = "category_id", type = Long.class),
				@ColumnResult(name = "category_name", type = String.class),
				@ColumnResult(name = "initial", type = String.class), @ColumnResult(name = "name", type = String.class),
				@ColumnResult(name = "active", type = Boolean.class) })) })
@Entity
@Table(name = "variant")
public class VariantEntity {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	@Column(length = 50, nullable = false)
	private String createBy;

	@Column(name = "create_date", nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date createDate;

	@Column(name = "modify_by", length = 50)
	private String modifyBy;

	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date modifyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public CategoryEntity getCategoryEntity() {
		return category;
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

}
