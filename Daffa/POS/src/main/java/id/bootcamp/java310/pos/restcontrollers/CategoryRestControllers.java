package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.services.CategoryService;

@RestController
@RequestMapping("/api/category") // mapping url secara umum
public class CategoryRestControllers {

	@Autowired
	private CategoryService cs;

	// localhost/api/category/get
	@GetMapping("/get")
	public List<CategoryDTO> getAll() {
//		return cs.getAllCategories(); // Cara 1 & 2
//		return cs.getAllCategories3(); // Cara 3
		return cs.getAllCategories45(); // Cara4
	}
	
	@PostMapping("/insert")
	public Long insertCategory(@RequestBody CategoryDTO dto) {
//		return cs.insert1(dto);
		return cs.insert2(dto);
	}
}
