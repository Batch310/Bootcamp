package id.bootcamp.java310.katalogmobil.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.katalogmobil.dto.TypeDTO;
import id.bootcamp.java310.katalogmobil.services.TypeService;
import id.bootcamp.java310.katalogmobil.utils.Response;

@RestController
@RequestMapping("/api/mobil")
public class TypeRestController {

	@Autowired
	private TypeService ts;
	
	@GetMapping("/get/type")
	public Response<List<TypeDTO>> getAll() {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<TypeDTO> data = ts.getAllTypes();

		Response<List<TypeDTO>> response = new Response<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}
	
	@GetMapping("/get/detail")
	public Response<List<TypeDTO>> getTypeByBrand(@RequestParam("brand_id") Long brandID, @RequestParam("type_id") Long typeID) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<TypeDTO> data = ts.getTypeDetail(brandID, typeID);
		
		Response<List<TypeDTO>> response = new Response<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	
}
