package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variant")
public class VariantController {
	
	@RequestMapping("/home")
	public String home() {
		return "variant/variant-fullui.html";
	}

}
