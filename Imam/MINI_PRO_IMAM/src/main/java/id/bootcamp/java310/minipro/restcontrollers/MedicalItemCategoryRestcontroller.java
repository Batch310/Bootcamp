package id.bootcamp.java310.minipro.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.minipro.dto.MedicalItemCategoryDto;
import id.bootcamp.java310.minipro.services.MedicalItemCategoryServices;
import id.bootcamp.java310.minipro.utills.Resp;


@RestController
@RequestMapping("/api/category")
public class MedicalItemCategoryRestcontroller {
	
	@Autowired
	private MedicalItemCategoryServices medicalService;
	
	//GET API
	@GetMapping("/get")
	public Resp<List<MedicalItemCategoryDto>> getAll(){
		
		// Mengemas Response API
				int code = 200;
				String message = "Sukses";
				List<MedicalItemCategoryDto> data = medicalService.getAllName();

				Resp<List<MedicalItemCategoryDto>> response = new Resp<>();
				response.setCode(code);
				response.setMessage(message);
				response.setData(data);

				return response;
		
	}

}
