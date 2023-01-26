package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_treatment_discount")
public class T_Treatment_Discount extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long doctor_office_treatment_price_id;
	
	private Double value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDoctor_office_treatment_price_id() {
		return doctor_office_treatment_price_id;
	}

	public void setDoctor_office_treatment_price_id(Long doctor_office_treatment_price_id) {
		this.doctor_office_treatment_price_id = doctor_office_treatment_price_id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
