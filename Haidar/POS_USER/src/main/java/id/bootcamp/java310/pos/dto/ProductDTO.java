package id.bootcamp.java310.pos.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {
	private Long category_id;
	private Long variant_id;
	private Long id;
	private String category_name;
	private String variant_name;
	private String initial;
	private String name;
	private Boolean active;
	private String description;
	private Double price;
	private Double stock;
	private String create_by;
	private String modify_by;
	private String delete_by;
	private Boolean is_delete;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	public ProductDTO(Long category_id, Long variant_id, Long id, String category_name, String variant_name,
			String initial, String name, Boolean active, String description, Double price, Double stock) {
		super();
		this.category_id = category_id;
		this.variant_id = variant_id;
		this.id = id;
		this.category_name = category_name;
		this.variant_name = variant_name;
		this.initial = initial;
		this.name = name;
		this.active = active;
		this.description = description;
		this.price = price;
		this.stock = stock;
	}



	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getVariant_name() {
		return variant_name;
	}

	public void setVariant_name(String variant_name) {
		this.variant_name = variant_name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStock() {
		return stock;
	}

	public void setStock(Double stock) {
		this.stock = stock;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public Long getVariant_id() {
		return variant_id;
	}

	public void setVariant_id(Long variant_id) {
		this.variant_id = variant_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getDelete_by() {
		return delete_by;
	}

	public void setDelete_by(String delete_by) {
		this.delete_by = delete_by;
	}

	public Boolean getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Boolean is_delete) {
		this.is_delete = is_delete;
	}
	
	
}
