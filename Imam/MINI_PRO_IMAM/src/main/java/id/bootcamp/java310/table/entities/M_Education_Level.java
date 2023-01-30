package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_education_level")
public class M_Education_Level extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name = "name", length = 10)
	private String name;
	
}
