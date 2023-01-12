package id.bootcamp.java310.pos.restcontollers;

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
@RequestMapping("/api/category") // Mapping URL secara umum
public class CategoryRestControllers {

	@Autowired
	private CategoryService cs;

	// localhost/api/category/get
	@GetMapping("/get")
	public List<CategoryDTO> getAll() {
		// cara 1,2
		//return cs.getAllCategories();
		
		//cara 3
		//return cs.getAll3();
		
		//cara 4, 5
		return cs.getAll45();

	}
	
	@PostMapping("/insert")
	public Long insertCategory(@RequestBody CategoryDTO dto) {
		// Cara 1
		//return cs.insert1(dto);
		return cs.insert2(dto);
	}
	
	// localhost/api/category/update
	@PutMapping("/update")
	public void updateCategory(@RequestBody CategoryDTO dto) {
		cs.update(dto);
	}
	
	@DeleteMapping("/delete")
	public void deleteCategory(@RequestParam("id") Long id) {
		cs.delete(id);
	}
	
	
}
