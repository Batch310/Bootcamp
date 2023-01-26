package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "m_medical_item")
public class M_Medical_Item extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 50)
	private String name;

	private Long medical_item_category_id;

	private String composition;

	private Long medical_item_segmentation_id;

	@Column(length = 100)
	private String manufacturer;

	private String indication;

	private String dosage;

	private String directions;

	private String contraindication;

	private String caution;

	@Column(length = 50)
	private String packaging;

	private Long price_max;

	private Long price_min;

	@Lob
	private Byte image;

	@Column(length = 100)
	private String image_path;

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

	public Long getMedical_item_category_id() {
		return medical_item_category_id;
	}

	public void setMedical_item_category_id(Long medical_item_category_id) {
		this.medical_item_category_id = medical_item_category_id;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public Long getMedical_item_segmentation_id() {
		return medical_item_segmentation_id;
	}

	public void setMedical_item_segmentation_id(Long medical_item_segmentation_id) {
		this.medical_item_segmentation_id = medical_item_segmentation_id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getIndication() {
		return indication;
	}

	public void setIndication(String indication) {
		this.indication = indication;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public String getContraindication() {
		return contraindication;
	}

	public void setContraindication(String contraindication) {
		this.contraindication = contraindication;
	}

	public String getCaution() {
		return caution;
	}

	public void setCaution(String caution) {
		this.caution = caution;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public Long getPrice_max() {
		return price_max;
	}

	public void setPrice_max(Long price_max) {
		this.price_max = price_max;
	}

	public Long getPrice_min() {
		return price_min;
	}

	public void setPrice_min(Long price_min) {
		this.price_min = price_min;
	}

	public Byte getImage() {
		return image;
	}

	public void setImage(Byte image) {
		this.image = image;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	
	
}
