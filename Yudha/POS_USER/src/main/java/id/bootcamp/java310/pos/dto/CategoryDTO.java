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
	private String delete_by;
	private Boolean is_delete;
	
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

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the initial
	 */
	public String getInitial() {
		return initial;
	}

	/**
	 * @param initial the initial to set
	 */
	public void setInitial(String initial) {
		this.initial = initial;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

	/**
	 * @return the create_by
	 */
	public String getCreate_by() {
		return create_by;
	}

	/**
	 * @param create_by the create_by to set
	 */
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	/**
	 * @return the modify_by
	 */
	public String getModify_by() {
		return modify_by;
	}

	/**
	 * @param modify_by the modify_by to set
	 */
	public void setModify_by(String modify_by) {
		this.modify_by = modify_by;
	}

	/**
	 * @return the delete_by
	 */
	public String getDelete_by() {
		return delete_by;
	}

	/**
	 * @param delete_by the delete_by to set
	 */
	public void setDelete_by(String delete_by) {
		this.delete_by = delete_by;
	}

	/**
	 * @return the is_delete
	 */
	public Boolean getIs_delete() {
		return is_delete;
	}

	/**
	 * @param is_delete the is_delete to set
	 */
	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}
	
}
