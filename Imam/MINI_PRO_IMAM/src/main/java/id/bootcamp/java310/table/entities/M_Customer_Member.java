package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_customer_member")
public class M_Customer_Member extends BaseProperties{

	@Id
	@Column(nullable = false)
	private Long id;
	
	private Long parent_biodata_id;
	
	private Long customer_id;
	
	private Long customer_relation_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParent_biodata_id() {
		return parent_biodata_id;
	}

	public void setParent_biodata_id(Long parent_biodata_id) {
		this.parent_biodata_id = parent_biodata_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getCustomer_relation_id() {
		return customer_relation_id;
	}

	public void setCustomer_relation_id(Long customer_relation_id) {
		this.customer_relation_id = customer_relation_id;
	}
	
	
	


	
}
