package id.bootcamp.java310.minipro.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalItemCategoryDto {

	private Long id;

	private String name;

	private String create_by;

	private String modify_by;
	
	public MedicalItemCategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalItemCategoryDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
