package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_doctor_office_treatment_price")
public class T_Doctor_Office_Treatment_Price {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long doctor_office_trreatment_id;
	
	private Double price;
	private Double price_start_from;
	private Double price_until_from;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDoctor_office_trreatment_id() {
		return doctor_office_trreatment_id;
	}
	public void setDoctor_office_trreatment_id(Long doctor_office_trreatment_id) {
		this.doctor_office_trreatment_id = doctor_office_trreatment_id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPrice_start_from() {
		return price_start_from;
	}
	public void setPrice_start_from(Double price_start_from) {
		this.price_start_from = price_start_from;
	}
	public Double getPrice_until_from() {
		return price_until_from;
	}
	public void setPrice_until_from(Double price_until_from) {
		this.price_until_from = price_until_from;
	}
	
	
}
