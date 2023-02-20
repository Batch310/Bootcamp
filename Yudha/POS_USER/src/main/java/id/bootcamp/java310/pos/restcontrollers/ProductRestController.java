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

import id.bootcamp.java310.pos.dto.ProductDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.ProductService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {
	
	@Autowired
	private ProductService ps;
	
	@GetMapping("get")
	public Resp<List<ProductDTO>> getAll(){
		int code = 200;
		String message = "Sukses";
		List<ProductDTO> data = ps.getAll();
		
		Resp<List<ProductDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	
	@PostMapping("/insert")
	public Resp<Long> insert(@RequestBody ProductDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Product berhasil ditambah!";
			Long data = ps.insertItem(dto);

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
	public Resp<Long> update(@RequestBody ProductDTO dto) {
		try {
			// Mengemas Response API
			int code = 200;
			String message = "Product berhasil diubah!";
			ps.updateItem(dto);

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
			String message = "Product berhasil dihapus!";
			ps.delete(id);

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
	
	@GetMapping("search")
	public Resp<List<ProductDTO>> searchProduct(@Param("keyword") String keyword){
		int code = 200;
		String message = "Sukses";
		List<ProductDTO> data = ps.searchProduct(keyword);
		
		Resp<List<ProductDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	@GetMapping("getProductById")
	public Resp<ProductDTO> getProductById(@Param("id") int id){
		int code = 200;
		String message = "Sukses";
		ProductDTO data = ps.getProductById(id);
		
		Resp<ProductDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	
}
