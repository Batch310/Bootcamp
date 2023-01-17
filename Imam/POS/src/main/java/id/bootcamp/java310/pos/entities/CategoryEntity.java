package id.bootcamp.java310.pos.entities;

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
import javax.persistence.NamedQueries;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import id.bootcamp.java310.pos.dto.CategoryDTO;

//Anotasi

@NamedNativeQueries( value = {
		@NamedNativeQuery(
		name = "get_categories_cara4",
		query = "select \r\n"
				+ "        id,\r\n"
				+ "        initial,\r\n"
				+ "        name,\r\n"
				+ "        active\r\n"
				+ "from category\r\n"
				+ "order by initial asc",
		resultSetMapping = "get_categories_cara4_result"			
	),	@NamedNativeQuery(
			name = "search_category",
			query = "select \r\n"
					+ "	id,\r\n"
					+ "	initial,\r\n"
					+ "    name,\r\n"
					+ "	active\r\n"
					+ "from category\r\n"
					+ "where name ilike '%'|| :keyword||'%'\r\n"
					+ "order by initial asc",
			resultSetMapping = "get_categories_cara4_result"			
		),  @NamedNativeQuery(
				name = "pagination_category",
				query = "select \r\n"
						+ "        id,\r\n"
						+ "        initial,\r\n"
						+ "        name,\r\n"
						+ "        active\r\n"
						+ "from category\r\n"
						+ "where name ilike '%' || :keyword ||'%'\r\n"
						+ "order by id asc\r\n"
						+ "limit :limit\r\n"
						+ "offset :offset",
				resultSetMapping = "get_categories_cara4_result"			
			)
		
		
		
})
@SqlResultSetMappings(value = {
		@SqlResultSetMapping(
		name = "get_categories_cara4_result",		
		classes = @ConstructorResult(
				targetClass = CategoryDTO.class,
				columns = {
						@ColumnResult(name = "id", type = Long.class),
						@ColumnResult(name = "initial", type = String.class),
						@ColumnResult(name = "name", type = String.class),
						@ColumnResult(name = "active", type = Boolean.class),		
						
				}
				)		
				
		)		
})
@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "category") // Menambahkan tabel
public class CategoryEntity {

	//Pakai private dan get n setter
	
	
	@Id //Primay key
	@Column(nullable = false)                            //kolom gak boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto increment
	private Long id;
	
	@Column(length = 10, nullable = false, unique=true) 
	private String initial;
	
	@Column(length = 50, nullable = false, unique=true) 
	private String name;
	
	@Column(nullable = false)
	private Boolean active;
	
	@Column(name ="create_by",length =50,nullable = false)
	private String createBy;
	
	@Column(name="create_date",nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date createDate;
	
	@Column(name ="modify_by",length =50, nullable = true)
	private String modifyBy;
	
	@Column(name="modify_date", nullable = true)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date modifyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
