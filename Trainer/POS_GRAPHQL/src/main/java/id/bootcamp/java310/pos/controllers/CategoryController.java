package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@RequestMapping("/home")
	public String home() {
//		return "category/category-template.html";
//		return "category/category-full.html";
//		return "category/category-pisah.html";
//		return "category/category-search.html";
		return "category/category-pagination.html";
	}
	
	
}
