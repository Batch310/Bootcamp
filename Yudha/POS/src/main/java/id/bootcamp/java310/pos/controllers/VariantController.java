package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // penanda class HelloController itu Controller
@RequestMapping("/variant") //Buat Mapping URL secara umum
public class VariantController {
	@RequestMapping("/home") // Buat mapping URL secara khusus
	public String home() {
		return "variant/variant-pagination.html";
	}
}
