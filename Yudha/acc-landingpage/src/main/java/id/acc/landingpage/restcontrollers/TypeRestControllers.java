package id.acc.landingpage.restcontrollers;

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

import id.acc.landingpage.dto.BrandDTO;
import id.acc.landingpage.dto.TypeDTO;
import id.acc.landingpage.services.BrandService;
import id.acc.landingpage.services.TypeService;
import id.acc.landingpage.utils.Resp;



@RestController
@RequestMapping("/api/type") // Mapping URL secara umum
public class TypeRestControllers {

	@Autowired
	private TypeService ts;

	@GetMapping("/get")
	public Resp<List<TypeDTO>> getAllType() {
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<TypeDTO> data = ts.getAllType();
//		List<CategoryDTO> data = cs.getAll();

		Resp<List<TypeDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
		
	}

	
}
