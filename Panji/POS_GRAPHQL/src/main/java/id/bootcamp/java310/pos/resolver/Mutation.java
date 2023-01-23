package id.bootcamp.java310.pos.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.services.VariantService;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private CategoryService cs;
	
	@Autowired
	private VariantService vs;

	// Create Category
	public Long createCategory(String initial, String name, Boolean active, String create_by) throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setCreate_by(create_by);

		return cs.insert1(categoryDTO);
	}

	// Update Category
	public Boolean updateCategory(Long id, String initial, String name, Boolean active, String modify_by)
			throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(id);
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setModify_by(modify_by);
		cs.update(categoryDTO);
		return true;
	}

	// Delete Category
	public Boolean deleteCategory(Long id) throws Exception {
		cs.delete(id);
		return true;
	}
	
	// Create Variant
	public Long createVariant(Long category_id, String initial, String name, Boolean active, String create_by) throws Exception {
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setCategory_id(category_id);
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setCreate_by(create_by);
		
		return vs.insert2(variantDTO);
	}
	
	// Update Variant
	public Boolean updateVariant(Long id, Long category_id, String initial, String name, Boolean active, String modify_by) throws Exception {
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setId(id);
		variantDTO.setCategory_id(category_id);
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setModify_by(modify_by);
		vs.update(variantDTO);
		return true;
	}
	
	// Delete Variant
	public Boolean deleteVariant(Long id) throws Exception {
		vs.delete(id);
		return true;
	}
}
