package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	@RequestMapping("/home") // Buat mapping secara khusus
	public String home() {
		return "category/category-pisah.html"; // File html yang mau ditampilkan
	}
	
}
