package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // penanda class HelloController itu Controller
@RequestMapping("/category") //Buat Mapping URL secara umum
public class CategoryController {
	@RequestMapping("/home") // Buat mapping URL secara khusus
	public String home() {
		return "category/category-pisah.html";
	}
}
