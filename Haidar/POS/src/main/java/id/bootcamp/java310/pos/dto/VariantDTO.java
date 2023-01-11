package id.bootcamp.java310.pos.dto;

public class VariantDTO {
	//(id, category_id, category_name, initial, name, active, create_by, modify_by)
	private Long id;
	private Long category_id;
	private String category_name;
	private String initial;
	private String name;
	private Boolean active;
	private String create_by;
	private String modify_by;
	
	public VariantDTO() {
		// TODO Auto-generated constructor stub
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
}
