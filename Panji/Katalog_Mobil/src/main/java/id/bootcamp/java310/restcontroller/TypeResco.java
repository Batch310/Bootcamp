package id.bootcamp.java310.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.dto.TypeDto;
import id.bootcamp.java310.services.TypeService;
import id.bootcamp.java310.utils.Resp;

@RestController
@RequestMapping("/api/type")
public class TypeResco {

	@Autowired
	private TypeService typeService;

	// Read
	@GetMapping("/get")
	public Resp<List<TypeDto>> getAllData() {
		int code = 200;
		String message = "Sukses";

		List<TypeDto> data = typeService.getAllData();

		Resp<List<TypeDto>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);

		return response;
	}

}
