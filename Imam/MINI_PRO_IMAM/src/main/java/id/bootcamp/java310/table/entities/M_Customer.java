package id.bootcamp.java310.table.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_customer")
public class M_Customer extends BaseProperties{

	@Id
	@Column(nullable = false)
	private Long id;
	
	private Long biodata_id;
	
	private Date dob;
	
	@Column(length = 1)
	private String gender;
	
	private Long blood_group_id;
	
	@Column(length = 5)
	private String rhesus_type;

	private Long height;
	
	private Long weight;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBiodata_id() {
		return biodata_id;
	}

	public void setBiodata_id(Long biodata_id) {
		this.biodata_id = biodata_id;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Long getBlood_group_id() {
		return blood_group_id;
	}

	public void setBlood_group_id(Long blood_group_id) {
		this.blood_group_id = blood_group_id;
	}

	public String getRhesus_type() {
		return rhesus_type;
	}

	public void setRhesus_type(String rhesus_type) {
		this.rhesus_type = rhesus_type;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}
	
	
	
}
