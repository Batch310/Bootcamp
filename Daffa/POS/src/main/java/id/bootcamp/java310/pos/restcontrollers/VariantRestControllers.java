package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.VariantService;

@RestController
@RequestMapping("/api/variant")
public class VariantRestControllers {

	@Autowired
	private VariantService vs;
	
	@GetMapping("/get")
	public List<VariantDTO> getAll(){
		return vs.getAllVariant();
	}
}
