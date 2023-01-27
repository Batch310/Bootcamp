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
public class M_Doctor_Education extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@ManyToMany
	@JoinColumn(name = "doctor_id", insertable = false, updatable = false)
	private M_Doctor doctor;

	@Column(name = "doctor_id")
	private Long doctorId;

	@ManyToMany
	@JoinColumn(name = "education_level_id", insertable = false, updatable = false)
	private M_Education_Level educationLevel;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public M_Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(M_Doctor doctor) {
		this.doctor = doctor;
	}

	public Long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}

	public M_Education_Level getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(M_Education_Level educationLevel) {
		this.educationLevel = educationLevel;
	}

	public Long getEducationLevelId() {
		return educationLevelId;
	}

	public void setEducationLevelId(Long educationLevelId) {
		this.educationLevelId = educationLevelId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public Boolean getIsLastEducation() {
		return isLastEducation;
	}

	public void setIsLastEducation(Boolean isLastEducation) {
		this.isLastEducation = isLastEducation;
	}

}
