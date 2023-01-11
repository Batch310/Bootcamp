package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.services.CategoryService;

@RestController
@RequestMapping("api/category")
public class CategoryRestController {
	
	@Autowired //Untuk menyambungkan Rest COntroller dengan Service
	private CategoryService cs;
	
	//READ
	//localhost:8080/api/category/get
	@GetMapping("/get")
	public List<CategoryDTO> getAll() {
		//Cara 1 dan Cara 2
//		return cs.getAllCategories();
		
		//Cara 3
//		return cs.getAll3();
		
		//Cara 4 - Step 5
//		return cs.getAll4();

		//Cara 5 - Step 4
		return cs.getAll5();
	}
	
	//CREATE
	//localhost:8080/api/category/insert
	@PostMapping("/insert")
	public String insertCategory(@RequestBody CategoryDTO dto) {
		//Cara 1
//		return cs.insert1(dto);
		
		//Cara 2 - Step 3
		return cs.insert2(dto);
	}
	
	//UPDATE
	//localhost:8080/api/category/update
	@PutMapping("/update")
	public void updateCategory(@RequestBody CategoryDTO dto) {
		cs.update(dto);
	}
	
	//DELETE
	//localhost:8080/api/category/delete
	@DeleteMapping("/delete")
	public void deleteCategory(@RequestParam Long id) {
		cs.delete(id);
	}
}
