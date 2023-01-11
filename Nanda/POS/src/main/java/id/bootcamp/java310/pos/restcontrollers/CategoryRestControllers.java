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
@RequestMapping("/api/category") //Mapping URL secara umum
public class CategoryRestControllers {

	@Autowired
	private CategoryService cs;
	
	//localhost/api/category/get
	@GetMapping("/get")
	public List<CategoryDTO> getAll(){
		//Cara 1 dan 2
		//return cs.getAllCategories();
		//Cara 3
		//return cs.getAll3();
		//Cara 4
		//return cs.getAll4();
		//cara5
		return cs.getAll45();
	}
	
	@PostMapping("/insert")
	public Long insertCategory(@RequestBody CategoryDTO dto) {
		//cara1
	//	return cs.insert1(dto);
		//cara2
		return cs.insert2(dto);
	}
	
	//localhost:8080/api/category/update
	@PutMapping("/update")
	public void updateCategory(@RequestBody CategoryDTO dto) {
		cs.update(dto);
	}
	
	@DeleteMapping("/delete")
	public void deleteCategory (@RequestParam("id") Long id) {
		cs.delete(id);
	}
	
}























