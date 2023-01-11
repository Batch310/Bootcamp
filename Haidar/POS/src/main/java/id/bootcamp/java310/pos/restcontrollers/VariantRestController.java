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
@RequestMapping("api/variant")
public class VariantRestController {
	
	@Autowired //Untuk menyambungkan Rest Controller dengan Service
	private VariantService vs;
	
	//localhost:8080/api/category/get
	@GetMapping("/get")
	public List<VariantDTO> getAll() {
		return vs.getAllVariants();
	}
	
	@PostMapping("/insert")
	public String insert(@RequestBody VariantDTO dto) {
		return vs.createVariant(dto);
	}
	
	@PutMapping("/update")
	public String update(@RequestBody VariantDTO dto) {
		return vs.updateVariant(dto);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam Long id) {
		return vs.deleteVariant(id);
	}
	
	@GetMapping("/getCat")
	public List<VariantDTO> get() {
		return vs.getCategory();
	}
}
