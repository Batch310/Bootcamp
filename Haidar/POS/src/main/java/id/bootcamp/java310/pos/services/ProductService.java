//package id.bootcamp.java310.pos.services;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import id.bootcamp.java310.pos.dto.ProductDTO;
//import id.bootcamp.java310.pos.entities.ProductEntity;
//import id.bootcamp.java310.pos.repositories.ProductRepository;
//
//@Service
//public class ProductService {
//	
//	@Autowired
//	private ProductRepository pr;
//	
//	//READ
//	//Cara 1
//	public List<ProductDTO> getAllVariants() {
//		//SELECT * FROM VARIANT
//		List<ProductEntity> varRef = pr.findAll();
//		
//		List<ProductDTO> varList = new ArrayList<>();
//		
//		for (int i = 0; i < varRef.size(); i++) {
//			ProductDTO var = new ProductDTO();
//			
//			var.setId(varRef.get(i).getId());
//			var.setCategory_id(varRef.get(i).getCategoryId());
//			var.setCategory_name(varRef.get(i).getCategory().getName());
//			var.setInitial(varRef.get(i).getInitial());
//			var.setName(varRef.get(i).getName());
//			var.setActive(varRef.get(i).getActive());
//			
//			varList.add(var);
//		}
//		return varList;
//	}
//	
//	//CREATE
//	
//	//UPDATE
//	
//	//DELETE
//}
