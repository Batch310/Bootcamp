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
@Table(name = "t_customer_va_history")
public class T_Customer_Va_History extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long customer_va_id;
	
	private Double amount;
	
	private Date expired_on;

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
	 * @return the customer_va_id
	 */
	public Long getCustomer_va_id() {
		return customer_va_id;
	}

	/**
	 * @param customer_va_id the customer_va_id to set
	 */
	public void setCustomer_va_id(Long customer_va_id) {
		this.customer_va_id = customer_va_id;
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

	/**
	 * @return the expired_on
	 */
	public Date getExpired_on() {
		return expired_on;
	}

	/**
	 * @param expired_on the expired_on to set
	 */
	public void setExpired_on(Date expired_on) {
		this.expired_on = expired_on;
	}

	

	
	
}
