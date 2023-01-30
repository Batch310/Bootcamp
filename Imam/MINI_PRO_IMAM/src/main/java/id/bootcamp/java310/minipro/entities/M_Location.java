package id.bootcamp.java310.minipro.entities;

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
public class M_Location extends BaseProperties {

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
	private M_Location_Level locationLevel;
	
	@Column(name = "location_level_id")
	private Long locationLevelId;

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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public M_Location_Level getLocationLevel() {
		return locationLevel;
	}

	public void setLocationLevel(M_Location_Level locationLevel) {
		this.locationLevel = locationLevel;
	}

	public Long getLocationLevelId() {
		return locationLevelId;
	}

	public void setLocationLevelId(Long locationLevelId) {
		this.locationLevelId = locationLevelId;
	}
	
}
