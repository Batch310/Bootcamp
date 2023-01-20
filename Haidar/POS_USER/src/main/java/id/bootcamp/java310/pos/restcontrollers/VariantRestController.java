package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import id.bootcamp.java310.pos.services.VariantService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("/api/variant")
public class VariantRestController {

	@Autowired
	private VariantService vs;

	@GetMapping("/get")
	public Resp<List<VariantDTO>> getAllVariants() {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<VariantDTO> data = vs.getAllVariants();

		Resp<List<VariantDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}

	@PostMapping("/insert")
	public Resp<Long> insert(@RequestBody VariantDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Variant berhasil ditambah!";
			Long data = vs.insert(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}

	}

	@PutMapping("/update")
	public Resp<Long> update(@RequestBody VariantDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Variant berhasil diubah!";
			vs.update(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;

		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}

	}

	@DeleteMapping("/delete")
	public Resp<Long> delete(@RequestParam("id") Long id) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Variant berhasil dihapus!";
			vs.delete(id);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;

		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}
	
	@PutMapping("/deleted")
	public Resp<Long> deleteVariantByIsDelete(@RequestParam("user_id") Long userId, @RequestParam("id") Long id) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Variant berhasil dihapus!";
			vs.deleteVariantByIsDelete(userId, id);
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			
			return response;
			
		} catch (Exception e) {
			String exceptionMessage = e.getMessage(); // "11-Blablabla"
			String[] split = exceptionMessage.split("-");
			
			int code = Integer.parseInt(split[0]);
			String message = split[1];
			
			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
	}

	@GetMapping("/getByCategoryId")
	public Resp<List<VariantDTO>> getVariantsByCategoryId(@RequestParam("category_id") Long categoryId) {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<VariantDTO> data = vs.getVariantsByCategoryId(categoryId);

		Resp<List<VariantDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}

	@GetMapping("/search")
	public Resp<List<VariantDTO>> search(@RequestParam("keyword") String keyword) {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<VariantDTO> data = vs.search(keyword);

		Resp<List<VariantDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}
}
