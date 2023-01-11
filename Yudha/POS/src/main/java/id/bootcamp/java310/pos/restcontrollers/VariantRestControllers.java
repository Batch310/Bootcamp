package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.VariantService;

@RestController
@RequestMapping("/api/variant") //Mapping URL secara umum
public class VariantRestControllers {
	
	@Autowired
	private VariantService vs;
	
	//localhost/api/variant/get
	@GetMapping("/get")
	public List<VariantDTO> getAll(){
		return vs.getAll();
	}
	@PostMapping("/insert")
	public Long insertVariant(@RequestBody VariantDTO dto) {
		//cara2
		return vs.insert2(dto);
	}
}
