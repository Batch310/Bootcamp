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
import id.bootcamp.java310.pos.utills.Resp;

@RestController
@RequestMapping("/api/category") // MAPPING URL Secara umum
public class CategoryRestController {

	// konnektor(penghubung)
	@Autowired
	private CategoryService cs;

	// READ
	// localhost/api/category/get
	// Buat read (Get)
	@GetMapping("/get")
	public Resp<List<CategoryDTO>> getAll() {

		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<CategoryDTO> data = cs.getAll45();

		Resp<List<CategoryDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;

		// Cara 1 dan 2
		// return cs.getAllCategorys();

		// Cara 3
		// return cs.getAll3();

		// Cara 4
		// return cs.getAll4();

		// Cara 5

	}

	// INSERT
	// Localhost/api/category/insert
	@PostMapping("/insert")
	public Resp<Long> insertCategory(@RequestBody CategoryDTO dto) {

		try {

			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil Ditambahkan";
			Long data = cs.insert1(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);

			return response;

		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}
	}

	// Cara 1
//		return cs.insert1(dto);

	// Cara 2

	// UPDATE
	@PutMapping("/update")
	public Resp<Long> updateCategory(@RequestBody CategoryDTO dto) {

		try {

			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil diubah";

			// Jangan lupa dipanggil!!!
			cs.update(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;

		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}

	}

	// DELETE
	@DeleteMapping("/delete")
	public Resp<Long> deleteCategory(@RequestParam("id") Long id) {

		try {
			// Mengemas Response API
			int code = 200;
			String message = "Category berhasil dihapus";

			// Jangan lupa dipanggil!!!
			cs.delete(id);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-Message error"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;

		}
	
	}

}
