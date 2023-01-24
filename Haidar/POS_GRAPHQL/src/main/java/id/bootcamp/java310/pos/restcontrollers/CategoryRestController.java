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
import id.bootcamp.java310.pos.utils.Pagination;
import id.bootcamp.java310.pos.utils.Responses;

@RestController
@RequestMapping("api/category")
public class CategoryRestController {
	
	@Autowired //Untuk menyambungkan Rest COntroller dengan Service
	private CategoryService cs;
	
	//READ
	//localhost:8080/api/category/get
	@GetMapping("/get")
	public Responses<List<CategoryDTO>> getAll() {
		
		//Mengemas Response API
		int code = 200;
		String message = "Success";
		List<CategoryDTO> data = cs.getAll4();
		
		Responses<List<CategoryDTO>> resp = new Responses<>();
		resp.setCode(code);
		resp.setMessage(message);
		resp.setData(data);
		
		//Cara 1 dan Cara 2
//		return cs.getAllCategories();
		
		//Cara 3
//		return cs.getAll3();
		
		//Cara 4 - Step 5
//		return cs.getAll4();

		//Cara 5 - Step 4
//		return cs.getAll5();
		return resp;
	}
	
	//CREATE
	//localhost:8080/api/category/insert
	@PostMapping("/insert")
	public Responses<Long> insertCategory(@RequestBody CategoryDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category Added Successfully";
			Long data = cs.insert2(dto);

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
			resp.setData(data);
			// Cara 1
			//	return cs.insert1(dto);

			// Cara 2 - Step 3
			// return cs.insert2(dto);
			return resp;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); //"11-Initial sudah ada!"
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];
			
			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
			
			return resp;
		}
		
		
	}
	
	//UPDATE
	//localhost:8080/api/category/update
	@PutMapping("/update")
	public Responses<Long> updateCategory(@RequestBody CategoryDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category Updated Successfully";
			cs.update(dto); // Selalu dipanggil walau return void, untuk mengupdate data

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
//		cs.update(dto);

			return resp;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Initial sudah ada!"
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);

			return resp;
		}
	}
	
	//DELETE
	//localhost:8080/api/category/delete
	@DeleteMapping("/delete")
	public Responses<Long> deleteCategory(@RequestParam Long id) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category Deleted Successfully";
			cs.delete(id); // Selalu dipanggil walau return void, untuk mengupdate data

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
//		cs.delete(id);

			return resp;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // 
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);

			return resp;
		}
	}
	
	//SEARCH
	@GetMapping("/search")
	public Responses<List<CategoryDTO>> searchCategory(@RequestParam("keyword") String keyword) {
			// Mengemas Response API
			int code = 200;
			String message = "Success";
			List<CategoryDTO> data = cs.searchCategory(keyword.trim()); // Selalu dipanggil walau return void, untuk mengupdate data

			Responses<List<CategoryDTO>> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
			resp.setData(data);
			
			return resp;
	}
	
	//PAGINATION
	@GetMapping("/pagination")
	public Responses<Pagination<List<CategoryDTO>>> paginationCategory(@RequestParam("keyword") String keyword, @RequestParam("limit") int limit, @RequestParam("page") int page) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		Pagination<List<CategoryDTO>> data = cs.paginationCategory(keyword.trim(),limit,page); // Selalu dipanggil walau return void, untuk mengupdate data
		
		Responses<Pagination<List<CategoryDTO>>> resp = new Responses<>();
		resp.setCode(code);
		resp.setMessage(message);
		resp.setData(data);
		
		return resp;
	}
}
