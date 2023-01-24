package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	
	@RequestMapping("/home")
	public String home() {
//		return "category/category-template.html";
//		return "category/category-fullui.html";
//		return "category/category-separate.html";
//		return "category/category-search.html";
		return "category/category-pagination.html";
	}

}
