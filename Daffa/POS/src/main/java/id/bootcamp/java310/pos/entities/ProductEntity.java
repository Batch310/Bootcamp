package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // Menandakan ProductEntity sebagai Entity
@Table(name = "product") // Menamakan Table
public class ProductEntity {

	@Id // Primary Key
	@Column(nullable = false) // Kolom tidak boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long id;

	@ManyToOne
	@JoinColumn(name = "variant_id", insertable = false, updatable = false)
	private VariantEntity variant;

	@Column(name = "variant_id", nullable = false)
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

	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date createDate;

	@Column(name = "modify_by", length = 50, nullable = true)
	private String modifyBy;

	@Column(nullable = true)
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

	public Date getMmodifyDate() {
		return modifyDate;
	}

	public void setMmodifyDate(Date mmodifyDate) {
		this.modifyDate = mmodifyDate;
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

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
