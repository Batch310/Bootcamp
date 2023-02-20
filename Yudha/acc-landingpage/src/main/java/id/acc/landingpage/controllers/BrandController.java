package id.acc.landingpage.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/brand")
public class BrandController {

	@RequestMapping("/home")
	public String home() {
//		return "category/category-template.html";
//		return "category/category-full.html";
//		return "category/category-pisah.html";
//		return "category/category-search.html";
		
		//ROle ADMIN, WAREHOUSE
		// Login sesuai role
		
		return "category/category-pagination.html";
		
	}
	
	
}
