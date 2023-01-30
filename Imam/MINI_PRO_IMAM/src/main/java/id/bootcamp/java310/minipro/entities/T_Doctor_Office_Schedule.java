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
@Table(name = "t_doctor_office_schedule")
public class T_Doctor_Office_Schedule extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long doctor_id;
	
	private Long medical_facility_schedule_id;
	
	private Integer slot;

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
	 * @return the doctor_id
	 */
	public Long getDoctor_id() {
		return doctor_id;
	}

	/**
	 * @param doctor_id the doctor_id to set
	 */
	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	/**
	 * @return the medical_facility_schedule_id
	 */
	public Long getMedical_facility_schedule_id() {
		return medical_facility_schedule_id;
	}

	/**
	 * @param medical_facility_schedule_id the medical_facility_schedule_id to set
	 */
	public void setMedical_facility_schedule_id(Long medical_facility_schedule_id) {
		this.medical_facility_schedule_id = medical_facility_schedule_id;
	}

	/**
	 * @return the slot
	 */
	public Integer getSlot() {
		return slot;
	}

	/**
	 * @param slot the slot to set
	 */
	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	
	
	
}
