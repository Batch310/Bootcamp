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
	
	public Long createCategory(String initial, String name, Boolean active, String createBy) throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setCreate_by(createBy);
		
		return cs.insert2(categoryDTO);
	}
	
	public Boolean updateCategory(Long id, String initial, String name, Boolean active, String modifyBy) throws Exception{
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(id);
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setModify_by(modifyBy);
		cs.update(categoryDTO);
		return true;
	}
	
	public Boolean deleteCategory(Long id) throws Exception{
		cs.delete(id);
		return true;
	}
	
	public Long createVariant(Long category_id, String initial, String name, Boolean active, String createBy) throws Exception {
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setCategory_id(category_id);
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setCreate_by(createBy);
		
		return vs.insert2(variantDTO);
	}
	
	public Boolean updateVariant(Long id, Long category_id, String initial, String name, Boolean active, String modifyBy) throws Exception{
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setId(id);
		variantDTO.setCategory_id(category_id);
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setModify_by(modifyBy);
		vs.update(variantDTO);
		return true;
	}
	
	public Boolean deleteVariant(Long id) throws Exception{
		vs.delete(id);
		return true;
	}
}
