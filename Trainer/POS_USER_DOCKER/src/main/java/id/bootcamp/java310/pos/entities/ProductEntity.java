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

@Entity // Menandakan class CategoryEntity itu Entity
@Table(name = "product") // Menamakan Tabel
public class ProductEntity extends BaseProperties {
	@Id // Primary Key
	@Column(nullable = false) // Kolom gk boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="variant_id", insertable = false, updatable = false)
	private VariantEntity variantEntity;
	
	@Column(name = "variant_id", nullable = false)
	private Long variantId;

	@Column(length = 10, nullable = false, unique = true)
	private String initial;

	@Column(length = 50, nullable = false, unique = true)
	private String name;
	
	@Column(length = 500, nullable = true)
	private String description;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private Double price;
	
	@Column(columnDefinition = "Decimal(18,2)", nullable = false)
	private Double stock;

	@Column(nullable = false)
	private Boolean active;
	
	public ProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public ProductEntity(Long id, Long variantId, String initial, String name, String description, Double price,
			Double stock, Boolean active) {
		super();
		this.id = id;
		this.variantId = variantId;
		this.initial = initial;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stock = stock;
		this.active = active;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public VariantEntity getVariantEntity() {
		return variantEntity;
	}

	public void setVariantEntity(VariantEntity variantEntity) {
		this.variantEntity = variantEntity;
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
}
