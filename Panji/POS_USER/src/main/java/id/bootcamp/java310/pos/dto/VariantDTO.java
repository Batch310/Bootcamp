package id.bootcamp.java310.pos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VariantDTO {
	private Long id;
	private Long category_id;
	private String category_name;
	private String initial;
	private String name;
	private Boolean active;
	private String create_by;
	private String modify_by;
	private String deleted_by;
	private Boolean is_delete;
	private Long user_id;
	private Long variant_id;
	
	
	
	public VariantDTO() {
		
	}
	
	
	public VariantDTO(Long id, Long category_id, String category_name, String initial, String name, Boolean active) {
		super();
		this.id = id;
		this.category_id = category_id;
		this.category_name = category_name;
		this.initial = initial;
		this.name = name;
		this.active = active;
	}
	
	public Long getVariant_id() {
		return variant_id;
	}


	public void setVariant_id(Long variant_id) {
		this.variant_id = variant_id;
	}


	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
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
	public String getDeleted_by() {
		return deleted_by;
	}
	public void setDeleted_by(String deleted_by) {
		this.deleted_by = deleted_by;
	}
	public Boolean getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}
	
}
