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
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.utils.Pagination;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("/api/category") // Mapping URL secara umum
public class CategoryRestControllers {

	@Autowired
	private CategoryService cs;

	// localhost/api/category/get
	@GetMapping("/get")
	public Resp<List<CategoryDTO>> getAll() {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<CategoryDTO> data = cs.getAllCategories();

		Resp<List<CategoryDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;

		// Cara 1 dan 2
		// return cs.getAllCategories();
		// Cara 3
		// return cs.getAll3();
		// Cara 4
		// return cs.getAll4();
		// cara5
		// return cs.getAll45();
	}

	@PostMapping("/insert")
	public Resp<Long> insertCategory(@RequestBody CategoryDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil ditambahkan !";
			Long data = cs.insert1(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}

		// cara1
		// return cs.insert1(dto);
		// cara2
		// return cs.insert2(dto);
	}

	// localhost:8080/api/category/update
	@PutMapping("/update")
	public Resp<Long> updateCategory(@RequestBody CategoryDTO dto) {
		// Mengemas Response API
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil diubah !";
			cs.update(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}

		// cs.update(dto);
	}

	@DeleteMapping("/delete")
	public Resp<Long> deleteCategory(@RequestParam("id") Long id) {
		// Mengemas Response API
		// Mengemas Response API
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil dihapus !";
			cs.delete(id);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();
			String[] split = exceptionMessage.split("-");
			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		}

		// cs.delete(id);
	}
	
	//SEARCH
	@GetMapping("/search")
	public Resp<List<CategoryDTO>> search(@RequestParam("keyword") String keyword){
		int code = 200;
		String message ="Sukses";
		List<CategoryDTO> dataSearch = cs.search(keyword);
		Resp<List<CategoryDTO>> responseSearch = new Resp<>();
		responseSearch.setCode(code);
		responseSearch.setMessage(message);
		responseSearch.setData(dataSearch);
		
		return responseSearch;
	}
	
	//PAGINATION
	@GetMapping("/pagination")
	public Resp<Pagination<List<CategoryDTO>>> pagination(@RequestParam("keyword") String keyword,
			@RequestParam("limit") int limit,
			@RequestParam("page") int page){
		int code = 200;
		String message = "Sukses";
		Pagination<List<CategoryDTO>> data = cs.pagination(keyword, limit, page);
		Resp<Pagination<List<CategoryDTO>>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}

}
