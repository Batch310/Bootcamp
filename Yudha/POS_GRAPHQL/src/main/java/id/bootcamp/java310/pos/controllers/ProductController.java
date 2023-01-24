package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/home")
	public String home() {
//		return "category/category-template.html";
//		return "category/category-full.html";
		return "product/product-pisah.html";
	}
	
}
