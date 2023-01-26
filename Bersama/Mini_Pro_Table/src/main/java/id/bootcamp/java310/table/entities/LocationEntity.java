package id.bootcamp.java310.table.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "m_location")
public class LocationEntity extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name = "name", length = 100)
	private String name;
	
	@Column(name = "parent_id")
	private Long parentId;
	
	@ManyToOne
	@JoinColumn(name = "location_level_id", insertable = false, updatable = false)
	private LocationLevelEntity locationLevel;
	
	@Column(name = "location_level_id")
	private Long locationLevelId;
	
}
