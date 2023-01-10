package id.bootcamp.java310.pos.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity // Menandakan CategoryEntity sebagai Entity
@Table(name = "category") // Menamakan Table
public class CategoryEntity {

	@Id // Primary Key
	@Column(nullable = false) // Kolom tidak boleh null
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
	private Long id;

	@Column(length = 10, nullable = false, unique = true)
	private String initial;

	@Column(length = 50, nullable = false, unique = true)
	private String name;

	@Column(nullable = false)
	private Boolean active;

	@Column(name = "create_by", length = 50, nullable = false)
	private String createBy;

	@Column(nullable = false)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date createDate;

	@Column(name = "modify_by", length = 50, nullable = true)
	private String modifyBy;

	@Column(nullable = true)
	@JsonFormat(pattern = "dd-MM-yyyy HH:mm", timezone = "Asia/Jakarta")
	private Date modifyDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getMmodifyDate() {
		return modifyDate;
	}

	public void setMmodifyDate(Date mmodifyDate) {
		this.modifyDate = mmodifyDate;
	}

}
