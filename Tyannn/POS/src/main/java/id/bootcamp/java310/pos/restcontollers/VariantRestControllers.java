package id.bootcamp.java310.pos.restcontollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.CategoryDTO;
import id.bootcamp.java310.pos.dto.VariantDTO;
import id.bootcamp.java310.pos.services.CategoryService;
import id.bootcamp.java310.pos.services.VariantService;

@RestController
@RequestMapping("/api/variant")
public class VariantRestControllers {
	@Autowired
	private VariantService vs;

	// localhost/api/variant/get
	@GetMapping("/get")
	public List<VariantDTO> getAll() {
		return vs.getAllVariant();
	}

	@PostMapping("/insert")
	public Long insertVariant(@RequestBody VariantDTO dto) {
		return vs.insertVariant(dto);
	}
	
	
}
