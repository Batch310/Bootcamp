package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_current_doctor_specialization")
public class T_Current_Doctor_Specialization extends BaseProperties{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long doctor_id;
	
	private Long specialization_id;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}

	public Long getSpecialization_id() {
		return specialization_id;
	}

	public void setSpecialization_id(Long specialization_id) {
		this.specialization_id = specialization_id;
	}
	
	
	

}
