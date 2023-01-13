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

@Entity
@Table(name = "product")
public class ProductEntity {

	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "variant_id", insertable = false, updatable = false)
	private VariantEntity variant;
	
	@Column(name = "variant_id", nullable = false)
	private Long variantId;
	
	@Column(length =  10, nullable = false, unique = true )
	private String initial;
	
	@Column(length =  50, nullable = false, unique = true )
	private String name;
	
	@Column(length =  500, nullable = true )
	private String description;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private double price;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private double stock;
	
	@Column(nullable = false)
	private boolean active;
	
	@Column(name = "create_By", length = 50, nullable = false)
	private String createBy;
	
	@Column(name = "create_date", nullable = false)
	@JsonFormat(pattern = "dd-mm-yyyy HH:mm",timezone = "Asia/Jakarta")
	private Date createDate;
	
	@Column(name = "modify_by",length = 50)
	private String modifyBy;
	
	@Column(name = "modify_date")
	@JsonFormat(pattern = "dd-mm-yyyy HH:mm",timezone = "Asia/Jakarta")
	private Date modifyDate;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
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
