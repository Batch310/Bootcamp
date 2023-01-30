package id.bootcamp.java310.minipro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_medical_facility")
public class M_Medical_Facility {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@Column(name = "medical_facility_category_id")
	private Long medicalFacilityCategoryId;
	
	@Column(name = "location_id")
	private Long locationId;
	
	@Column(name = "full_address")
	private String fullAdress;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "phone_code", length = 10)
	private String phoneCode;
	
	@Column(name = "phone", length = 15)
	private String phone;
	
	@Column(name = "fax", length = 15)
	private String fax;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMedicalFacilityCategoryId() {
		return medicalFacilityCategoryId;
	}

	public void setMedicalFacilityCategoryId(Long medicalFacilityCategoryId) {
		this.medicalFacilityCategoryId = medicalFacilityCategoryId;
	}

	public Long getLocationId() {
		return locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getFullAdress() {
		return fullAdress;
	}

	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
	
	
	
	
	
}
