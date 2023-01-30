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
@Table(name = "t_doctor_office_treatment")
public class T_Doctor_Office_Treatment extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long doctor_treatment_id;
	
	private Long doctor_office_id;

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
	 * @return the doctor_treatment_id
	 */
	public Long getDoctor_treatment_id() {
		return doctor_treatment_id;
	}

	/**
	 * @param doctor_treatment_id the doctor_treatment_id to set
	 */
	public void setDoctor_treatment_id(Long doctor_treatment_id) {
		this.doctor_treatment_id = doctor_treatment_id;
	}

	/**
	 * @return the doctor_office_id
	 */
	public Long getDoctor_office_id() {
		return doctor_office_id;
	}

	/**
	 * @param doctor_office_id the doctor_office_id to set
	 */
	public void setDoctor_office_id(Long doctor_office_id) {
		this.doctor_office_id = doctor_office_id;
	}
	
	
	
}
