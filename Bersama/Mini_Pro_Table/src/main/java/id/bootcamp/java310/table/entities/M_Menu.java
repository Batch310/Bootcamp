package id.bootcamp.java310.table.entities;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "m_menu")
public class M_Menu extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	@Column(length = 20)
	private String name;

	@Column(length = 50)
	private String url;

	private Long parent_id;

	@Column(length = 100)
	private String big_icon;
	
	@Column(length = 100)
	private String small_icon;

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public Long getParent_id() {
		return parent_id;
	}

	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}

	public String getBig_icon() {
		return big_icon;
	}

	public void setBig_icon(String big_icon) {
		this.big_icon = big_icon;
	}

	public String getSmall_icon() {
		return small_icon;
	}

	public void setSmall_icon(String small_icon) {
		this.small_icon = small_icon;
	}

	
}
