package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_doctor_education")
public class DoctorEducationEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@ManyToMany
	@JoinColumn(name = "doctor_id", insertable = false, updatable = false)
	private DoctorEntity doctor;
	
	@Column(name = "doctor_id")
	private Long doctorId;
	
	@ManyToMany
	@JoinColumn(name = "education_level_id", insertable = false, updatable = false)
	private EducationLevelEntity educationLevel;
	
	@Column(name = "education_level_id")
	private Long educationLevelId;
	
	@Column(name = "institution_name", length = 100)
	private String institutionName;
		
	@Column(name = "major", length = 100)
	private String major;
	
	@Column(name = "start_year", length = 4)
	private String startYear;
	
	@Column(name = "end_year", length = 4)
	private String endYear;
	
	@Column(name = "is_last_education", columnDefinition = "boolean default false")
	private Boolean isLastEducation = false;
	
}
