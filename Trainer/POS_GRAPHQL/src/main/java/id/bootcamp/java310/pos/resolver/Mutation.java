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
	private VariantService variantService;

	public Long createCategory(String initial, String name, Boolean active, String createBy) throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setCreate_by(createBy);

		return cs.insert1(categoryDTO);
	}

	public Boolean updateCategory(Long id, String initial, String name, Boolean active, String modifyBy)
			throws Exception {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(id);
		categoryDTO.setInitial(initial);
		categoryDTO.setName(name);
		categoryDTO.setActive(active);
		categoryDTO.setModify_by(modifyBy);

		cs.update(categoryDTO);
		return true;
	}

	public Boolean deleteCategory(Long id) throws Exception {

		cs.delete(id);
		return true;
	}

	public Long createVariant(String name, String initial, Boolean active, String createBy, Long categoryId)
			throws Exception {
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setName(name);
		variantDTO.setInitial(initial);
		variantDTO.setActive(active);
		variantDTO.setCreate_by(createBy);
		variantDTO.setCategory_id(categoryId);

		return variantService.insert(variantDTO);
	}

	public Boolean updateVariant(Long id, String name, String initial, Boolean active, String modifyBy, Long categoryId)
			throws Exception {
		VariantDTO variantDTO = new VariantDTO();
		variantDTO.setId(id);
		variantDTO.setName(name);
		variantDTO.setInitial(initial);
		variantDTO.setActive(active);
		variantDTO.setModify_by(modifyBy);
		variantDTO.setCategory_id(categoryId);

		variantService.update(variantDTO);
		return true;
	}

	public boolean deleteVariant(Long id) throws Exception {
		variantService.delete(id);
		return true;
	}
}
