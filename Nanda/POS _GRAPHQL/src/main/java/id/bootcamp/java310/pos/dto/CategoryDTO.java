package id.bootcamp.java310.pos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryDTO {
	private Long id;
	private String initial;
	private String name;
	private Boolean active;
	private String create_by;
	private String modify_by;
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CategoryDTO(Long id, String initial, String name, Boolean active) {
		super();
		this.id = id;
		this.initial = initial;
		this.name = name;
		this.active = active;
	}
	
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
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public String getModify_by() {
		return modify_by;
	}
	public void setModify_by(String modify_by) {
		this.modify_by = modify_by;
	}
	
}
