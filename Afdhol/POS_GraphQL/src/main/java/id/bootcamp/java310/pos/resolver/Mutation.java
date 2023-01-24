package id.bootcamp.java310.pos.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.services.VariantService;

@Component
public class Mutation implements GraphQLMutationResolver{

	@Autowired
	private CategoryService cs;
	@Autowired
	private VariantService vs;
	
	public Long createCategory(
			String initial,
			String name,
			Boolean active,
			String createBy) throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO(); //buat tipe data categoryDTO
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setCreate_by(createBy);
		
		return cs.insert1(categoryDTO);
	}
	
	public Boolean updateCategory(
			Long id,
			String initial,
			String name,
			Boolean active,
			String modify_by
			) throws Exception {
		
		CategoryDTO categoryDTO = new CategoryDTO(); //buat tipe data categoryDTO
		categoryDTO.setId(id);
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setModify_by(modify_by);
		
		cs.update(categoryDTO);
		
		return true;
	}
	
	public Boolean deleteCategory(Long id) throws Exception {
		
		cs.delete(id);
		return true;
	}
	
	
	//=============VARIANT==========
	
	public Long createVariant(
			String initial,
			String name,
			Boolean active,
			String createBy,
			Long category_id) throws Exception {
		VariantDTO variantDTO = new VariantDTO(); //buat tipe data categoryDTO
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setCreate_by(createBy);
		variantDTO.setCategory_id(category_id);
		
		return vs.insert(variantDTO);
	}
	
	
	public Boolean updateVariant(
			Long id,
			String initial,
			String name,
			Boolean active,
			String modify_by,
			Long category_id
			
			) throws Exception {
		
		VariantDTO variantDTO = new VariantDTO(); //buat tipe data categoryDTO
		variantDTO.setId(id);
		variantDTO.setInitial(initial);
		variantDTO.setName(name);
		variantDTO.setActive(active);
		variantDTO.setModify_by(modify_by);
		variantDTO.setCategory_id(category_id);
				
		vs.update(variantDTO);
		return true;
	}
	
	public Boolean deleteVariant(Long id) throws Exception {
		
		vs.delete(id);
		return true;
	}
}
