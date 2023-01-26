package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_medical_item_purchase_detail")
public class T_Medical_Item_Purchase_Detail {

	
	@Id
	@Column(nullable = false)
	private Long id;
	
	private Long medical_item_purchase_id;
	
	private Long medical_item_id;
	
	private Integer qty;
	
	private Long medical_facility_id;
	
	private Long courier_id;
	
	private Long sub_total;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMedical_item_purchase_id() {
		return medical_item_purchase_id;
	}

	public void setMedical_item_purchase_id(Long medical_item_purchase_id) {
		this.medical_item_purchase_id = medical_item_purchase_id;
	}

	public Long getMedical_item_id() {
		return medical_item_id;
	}

	public void setMedical_item_id(Long medical_item_id) {
		this.medical_item_id = medical_item_id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Long getMedical_facility_id() {
		return medical_facility_id;
	}

	public void setMedical_facility_id(Long medical_facility_id) {
		this.medical_facility_id = medical_facility_id;
	}

	public Long getCourier_id() {
		return courier_id;
	}

	public void setCourier_id(Long courier_id) {
		this.courier_id = courier_id;
	}

	public Long getSub_total() {
		return sub_total;
	}

	public void setSub_total(Long sub_total) {
		this.sub_total = sub_total;
	}
	
	
	

}
