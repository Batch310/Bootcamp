package id.bootcamp.java310.pos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variant")
public class VariantController {

	@RequestMapping("/home")
	public String home(HttpServletRequest request, Model model) {

		String roleCode = (String) request.getSession().getAttribute("role_code");

		Long userId = (Long) request.getSession().getAttribute("user_id");

		model.addAttribute("user_id", userId);

		// Oper ROle Code
		if (roleCode == null) {
			return "redirect:/login";
		} else if (roleCode.equals("ADMIN") || roleCode.equals("WAREHOUSE")) {

			return "variant/variant-pisah.html";
		} else {
			return "redirect:/user/home";
		}

//		return "category/category-template.html";
//		return "category/category-full.html";
	}

}