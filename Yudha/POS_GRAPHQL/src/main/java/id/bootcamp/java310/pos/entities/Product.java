package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // menandakan clas CategoryEntity itu Entity
@Table(name = "product") // meanamakan table
public class Product {
	
	
	@Id //Primary Key
	@Column(nullable = false) // Kolom tdk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY)// auto increment
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="variant_id", insertable = false, updatable=false)
	private VariantEntity variant;
	
	@Column(name = "variant_id", nullable = false) // Kolom tdk boleh null
	private Long variantId;
	
	@Column(length = 10, nullable = false, unique = true)
	private String initial;
	
	@Column(length = 50, nullable = false, unique = true)
	private String name;
	
	@Column(length = 500)
	private String description;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private Double price;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private Double stock;
	
	@Column(nullable = false)
	private Boolean active;
	
	@Column(name = "create_by", length = 50, nullable = false)
	private String createBy;
	
	@Column(name = "create_date",nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm",timezone = "Asia/Jakarta")
	private Date createDate;
	
	@Column(name = "modify_by", length = 50)
	private String modifyBy;
	
	@Column(name = "modify_date")
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm",timezone = "Asia/Jakarta")
	private Date modifyDate;
	
	public Product() {
		
	}
	

	

	public Product(Long id, Long variantId, String initial, String name, String description,
			Double price, Double stock, Boolean active, String createBy, Date createDate) {
		super();
		this.id = id;
		this.variantId = variantId;
		this.initial = initial;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.active = active;
		this.createBy = createBy;
		this.createDate = createDate;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VariantEntity getVariant() {
		return variant;
	}

	public void setVariant(VariantEntity variant) {
		this.variant = variant;
	}

	public Long getVariantId() {
		return variantId;
	}

	public void setVariantId(Long variantId) {
		this.variantId = variantId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
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
