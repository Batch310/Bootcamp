package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_medical_facility_schedule")
public class M_Medical_Facility_Schedule extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long medical_facility_id;

	@Column(length = 10)
	private String day;

	@Column(length = 10)
	private String time_schedule_start;

	@Column(length = 10)
	private String time_schedule_end;

	public Long getMedical_facility_id() {
		return medical_facility_id;
	}

	public void setMedical_facility_id(Long medical_facility_id) {
		this.medical_facility_id = medical_facility_id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime_schedule_start() {
		return time_schedule_start;
	}

	public void setTime_schedule_start(String time_schedule_start) {
		this.time_schedule_start = time_schedule_start;
	}

	public String getTime_schedule_end() {
		return time_schedule_end;
	}

	public void setTime_schedule_end(String time_schedule_end) {
		this.time_schedule_end = time_schedule_end;
	}

}
