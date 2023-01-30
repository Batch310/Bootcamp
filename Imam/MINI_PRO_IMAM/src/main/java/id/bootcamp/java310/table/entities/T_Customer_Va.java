package id.bootcamp.java310.table.entities;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_customer_va")
public class T_Customer_Va extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long customer_id;
	
	@Column(length = 30)
	private String va_number;

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
	 * @return the customer_id
	 */
	public Long getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return the va_number
	 */
	public String getVa_number() {
		return va_number;
	}

	/**
	 * @param va_number the va_number to set
	 */
	public void setVa_number(String va_number) {
		this.va_number = va_number;
	}

	
	
}
