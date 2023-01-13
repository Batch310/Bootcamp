package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // import Controller, sebagai penanda bahwa classnya adalah Controller
@RequestMapping("/category")

public class CategoryController {

	@RequestMapping("/home") // membuat mapping url secara khusus
	public String home() {
		return "category/category-template-full.html";

	}

}