package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category/variant")
public class VariantController {
	
	@GetMapping("/home")
	public String home() {
		return "variant/variant-template.html";
	}

}
