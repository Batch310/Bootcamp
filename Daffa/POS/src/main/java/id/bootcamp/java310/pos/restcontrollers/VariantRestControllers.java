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

@RestController
@RequestMapping("/api/variant")
public class VariantRestControllers {

	@Autowired
	private VariantService vs;
	
	// localhost/api/variant/get
	@GetMapping("/get")
	public List<VariantDTO> getAll(){
		return vs.getAllVariant();
	}
	
	// localhost/api/variant/insert
	@PostMapping("/insert")
	public Long insertVariant(@RequestBody VariantDTO dto) {
		return vs.insertVar(dto);
	}
	
	// localhost/api/variant/update
	@PutMapping("/update")
	public void updateVariant(@RequestBody VariantDTO dto) {
		vs.updateVar(dto);
	}
	
	// localhost/api/variant/delete
	@DeleteMapping
	public void deleteVariant(@RequestParam("id") Long id) {
		vs.deleteVar(id);
	}
}
