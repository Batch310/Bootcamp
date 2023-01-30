package id.bootcamp.java310.minipro.entities;

import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "m_menu_role")
public class M_Menu_Role extends BaseProperties {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;

	private Long menu_id;

	private Long role_id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}

	public Long getRole_id() {
		return role_id;
	}

	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}

}
