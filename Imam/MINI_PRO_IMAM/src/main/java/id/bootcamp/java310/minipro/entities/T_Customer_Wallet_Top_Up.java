package id.bootcamp.java310.minipro.entities;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_customer_wallet_top_up")
public class T_Customer_Wallet_Top_Up extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long customer_wallet_id;
	
	
	private Double amount;


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the customer_wallet_id
	 */
	public Long getCustomer_wallet_id() {
		return customer_wallet_id;
	}


	/**
	 * @param customer_wallet_id the customer_wallet_id to set
	 */
	public void setCustomer_wallet_id(Long customer_wallet_id) {
		this.customer_wallet_id = customer_wallet_id;
	}


	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	
	
	
}
