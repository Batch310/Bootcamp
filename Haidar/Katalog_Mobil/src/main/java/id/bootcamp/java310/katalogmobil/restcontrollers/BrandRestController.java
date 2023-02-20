package id.bootcamp.java310.katalogmobil.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.katalogmobil.dto.BrandDTO;
import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.services.BrandService;
import id.bootcamp.java310.katalogmobil.utils.Response;

@RestController
@RequestMapping("/api/mobil")
public class BrandRestController {

	@Autowired
	private BrandService bs;
	
	@GetMapping("/get")
	public Response<List<TypeDTO>> getAll() {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<TypeDTO> data = bs.getAll();

		Response<List<TypeDTO>> response = new Response<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}
	
	@GetMapping("/get/brand")
	public Response<List<BrandDTO>> getAllBrands() {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<BrandDTO> data = bs.getAllBrands();
		
		Response<List<BrandDTO>> response = new Response<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	
}
