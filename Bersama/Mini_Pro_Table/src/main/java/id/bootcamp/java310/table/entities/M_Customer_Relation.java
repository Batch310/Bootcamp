package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_customer_relation")
public class M_Customer_Relation extends BaseProperties{

	@Id
	@Column(nullable = false)
	private Long id;
	
	@Column(length = 50)
	private String name;

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
	
	
	
}
