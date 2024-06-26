package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity extends BaseProperties {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "header_id", insertable = false, updatable = false)
	private OrderHeaderEntity orderHeader;

	@Column(name = "header_id", nullable = false)
	private Long headerId;
	
	@OneToOne
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	private ProductEntity product;

	@Column(name = "product_id", nullable = false)
	private Long productId;
	
	@Column(nullable = false)
	private Double quantity;
	
	@Column(nullable = false)
	private Double price;
	
	@Column(nullable = false)
	private Boolean active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OrderHeaderEntity getOrderHeader() {
		return orderHeader;
	}

	public void setOrderHeader(OrderHeaderEntity orderHeader) {
		this.orderHeader = orderHeader;
	}

	public Long getHeaderId() {
		return headerId;
	}

	public void setHeaderId(Long headerId) {
		this.headerId = headerId;
	}

	public ProductEntity getProduct() {
		return product;
	}

	public void setProduct(ProductEntity product) {
		this.product = product;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}	
}
