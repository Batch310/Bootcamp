package id.bootcamp.java310.pos.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@RequestMapping("/home")
	public String home(HttpServletRequest request, Model model) {
//		return "category/category-template.html";
//		return "category/category-full.html";
//		return "category/category-pisah.html";
//		return "category/category-search.html";
		//Role ADMIN, WAREHOUSE
		//HARUS LOGIN, KALO BELUM AKAN DIKEMBALIKAN KE LOGIN
		
		String roleCode = (String) request.getSession().getAttribute("role_code");
		Long userId = (Long) request.getSession().getAttribute("user_id");
		
		model.addAttribute("Panji", userId);
		
		if(roleCode == null) {
			return "redirect:/login";
		}else if(roleCode.equals("ADMIN") || roleCode.equals("WAREHOUSE")) {
			return "category/category-pagination.html";
		}else {
			return "redirect:/user/home";
		}
		
		
	}
	
	
}
