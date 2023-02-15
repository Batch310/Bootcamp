package id.bootcamp.java310.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.dto.BrandDto;
import id.bootcamp.java310.services.BrandServices;
import id.bootcamp.java310.utils.Resp;

@RestController
@RequestMapping("/api/brands")
public class BrandResco {

	@Autowired
	private BrandServices brandService;
	
	// Read
	@GetMapping("/get")
	public Resp<List<BrandDto>> getAllData(){
		int code = 200;
		String message = "Sukses";
		
		List<BrandDto> data = brandService.getAllData();
		
		Resp<List<BrandDto>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}
}
