package id.bootcamp.java310.minipro.entities;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "t_appointment_reschedule_history")
public class T_Appointment_Reschedule_History extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	private Long appointment_id;
	
	private Long doctor_office_schedule_id;
	
	private Long doctor_office_treatment_id;
	
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date appointment_date;
	
	
	public T_Appointment_Reschedule_History() {
		
	}

	public T_Appointment_Reschedule_History(Long id, Long appointment_id, Long doctor_office_schedule_id,
			Long doctor_office_treatment_id, Date appointment_date) {
		super();
		this.id = id;
		this.appointment_id = appointment_id;
		this.doctor_office_schedule_id = doctor_office_schedule_id;
		this.doctor_office_treatment_id = doctor_office_treatment_id;
		this.appointment_date = appointment_date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppointment_id() {
		return appointment_id;
	}

	public void setAppointment_id(Long appointment_id) {
		this.appointment_id = appointment_id;
	}

	public Long getDoctor_office_schedule_id() {
		return doctor_office_schedule_id;
	}

	public void setDoctor_office_schedule_id(Long doctor_office_schedule_id) {
		this.doctor_office_schedule_id = doctor_office_schedule_id;
	}

	public Long getDoctor_office_treatment_id() {
		return doctor_office_treatment_id;
	}

	public void setDoctor_office_treatment_id(Long doctor_office_treatment_id) {
		this.doctor_office_treatment_id = doctor_office_treatment_id;
	}

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}


	

}
