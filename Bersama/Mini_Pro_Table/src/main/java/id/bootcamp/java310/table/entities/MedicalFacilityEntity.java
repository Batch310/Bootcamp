package id.bootcamp.java310.table.entities;

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
public class MedicalFacilityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name = "name", length = 50)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "medical_facility_category_id", insertable = false, updatable = false)
	private M_Medical_Facility_Category medicalFacilityCategory;
	
	@Column(name = "medical_facility_category_id")
	private Long medicalFacilityCategoryId;

	@OneToMany
	@JoinColumn(name = "location_id", insertable = false, updatable = false)
	private M_Location location;
	
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
	
}
