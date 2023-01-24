package id.bootcamp.java310.pos.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.services.VariantService;

@Component
public class Query implements GraphQLQueryResolver {
	
	@Autowired
	private CategoryService cs;
	
	@Autowired
	private VariantService vs;
	
	public List<CategoryDTO> findAllCategories() {
		return cs.getAll4();
	}
	
	public List<VariantDTO> findAllVariants() {
		return vs.getAllVariants();
	}
	public List<VariantDTO> findVariantByCategoryID(Long category_id) {
		return vs.getVariantsByCategoryId(category_id);
	}
	
}