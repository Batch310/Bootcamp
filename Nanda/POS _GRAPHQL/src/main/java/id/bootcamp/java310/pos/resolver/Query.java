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
	
	public List<CategoryDTO> findAllCategories(){
		return cs.getAllCategories();
	}
	
	@Autowired
	private VariantService vs;
	
	public List<VariantDTO> findAllVariant(){
		return vs.getAllVariant();
	}
	
	public List<VariantDTO> findAllVariantByCategoryId(Long category_id){
		return vs.getVariantsByCategoryId(category_id);
	}

}
