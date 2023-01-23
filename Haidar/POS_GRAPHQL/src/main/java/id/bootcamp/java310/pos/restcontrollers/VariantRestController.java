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

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.VariantService;
import id.bootcamp.java310.pos.utils.Pagination;
import id.bootcamp.java310.pos.utils.Responses;

@RestController
@RequestMapping("api/variant")
public class VariantRestController {
	
	@Autowired //Untuk menyambungkan Rest Controller dengan Service
	private VariantService vs;
	
	//localhost:8080/api/category/get
	@GetMapping("/get")
	public Responses<List<VariantDTO>> getAll() {
		//Mengemas Response API
				int code = 200;
				String message = "Success";
				List<VariantDTO> data = vs.getAllVariants();
				
				Responses<List<VariantDTO>> resp = new Responses<>();
				resp.setCode(code);
				resp.setMessage(message);
				resp.setData(data);
		return resp;
	}
	
	@GetMapping("/getByCategoryId")
	public Responses<List<VariantDTO>> getVariantsByCategoryId(@RequestParam("category_id") Long categoryId) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<VariantDTO> data = vs.getVariantsByCategoryId(categoryId);

		Responses<List<VariantDTO>> response = new Responses<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}
	
	@PostMapping("/insert")
	public Responses<Long> insert(@RequestBody VariantDTO dto) {
		try {
			//Mengemas Response API
			int code = 200;
			String message = "Variant Added Successfully";
			Long data = vs.createVariant(dto);
			
			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
			resp.setData(data);
			
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
	
	@PutMapping("/update")
	public Responses<Long> update(@RequestBody VariantDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Variant Updated Successfully";
			vs.updateVariant(dto);

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
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
	
	@DeleteMapping("/delete")
	public Responses<Long> delete(@RequestParam Long id) {
		try {
			int code = 200;
			String message = "Variant Deleted Successfully";
			vs.deleteVariant(id);

			Responses<Long> resp = new Responses<>();
			resp.setCode(code);
			resp.setMessage(message);
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
	
	// localhost:8080/api/variant/search
	@GetMapping("/search")
	public Responses<List<VariantDTO>> searchVariant(@RequestParam String keyword) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<VariantDTO> data = vs.searchVariant(keyword);

		Responses<List<VariantDTO>> resp = new Responses<>();
		resp.setCode(code);
		resp.setMessage(message);
		resp.setData(data);
		return resp;
	}
	
	// localhost:8080/api/variant/pagination
	@GetMapping("/pagination")
	public Responses<Pagination<List<VariantDTO>>> paginationVariant(@RequestParam String keyword, @RequestParam int limit, @RequestParam int page) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		Pagination<List<VariantDTO>> data = vs.paginationVariant(keyword, limit, page);
		
		Responses<Pagination<List<VariantDTO>>> resp = new Responses<>();
		resp.setCode(code);
		resp.setMessage(message);
		resp.setData(data);
		return resp;
	}
}
