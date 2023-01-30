package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_medical_item_purchase")
public class T_Medical_Item_Purchase {

	@Id
	@Column(nullable = false)
	private Long id;
	
	private Long customer_id;
	
	private Long payment_method_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getPayment_method_id() {
		return payment_method_id;
	}

	public void setPayment_method_id(Long payment_method_id) {
		this.payment_method_id = payment_method_id;
	}
	
	
	

}
