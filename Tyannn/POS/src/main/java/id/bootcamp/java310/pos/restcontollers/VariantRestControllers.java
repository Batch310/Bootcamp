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
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.services.VariantService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("/api/variant")
public class VariantRestControllers {
	@Autowired
	private VariantService vs;

	// localhost/api/variant/get
	@GetMapping("/get")
	public Resp<List<VariantDTO>> getAll() {

		int code = 200;
		String message = "Sukses";
		List<VariantDTO> data = vs.getAllVariant();

		Resp<List<VariantDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;

	}

	@PostMapping("/insert")
	public Resp<Long> insertVariant(@RequestBody VariantDTO dto) {
		try {
			int code = 200;
			String message = "Variant Berhasil ditambahkan!";
			Long data = vs.insertVariant(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			response.setData(data);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-blabla"
			String[] split = exceptionMessage.split("-");

			int code = Integer.parseInt(split[0]);
			String message = split[1];

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);
			return response;
		}
		// Mengemas Response API

	}

	// localhost/api/category/update
	@PutMapping("/update")
	public Resp<Long> updateVariant(@RequestBody VariantDTO dto) {
		try {
			int code = 200;
			String message = "Variant Berhasil diubah!";
			// jangan lupa dipanggil
			vs.update(dto);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-blabla"
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
	public Resp<Long> deleteVariant(@RequestParam("id") Long id) {
		try {
			int code = 200;
			String message = "Variant Berhasil dihapus!";
			// jangan lupa dipanggil
			vs.delete(id);

			Resp<Long> response = new Resp<>();
			response.setCode(code);
			response.setMessage(message);

			return response;
		} catch (Exception e) {
			String exceptionMessage = e.getMessage();// "11-blabla"
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
