package id.bootcamp.java310.pos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/home")
	public String home(HttpServletRequest request, Model model) {
		
		
		//Role ADMIN, WAREHOUSE
		//Harus login, kalo belum arahain ke login
		String roleCode = (String) request.getSession().getAttribute("role_code");
		Long userId = (Long) request.getSession().getAttribute("user_id");
		
		//Oper ke HTML
		model.addAttribute("user_id", userId);
		
		if(roleCode == null) {
			return "redirect:/login";
		}else if(roleCode.equals("ADMIN") || roleCode.equals("CASHIER")) {
			return "order/order-template.html";
			
		}else {
			return "redirect:/user/home";
		}
	
	}
	
}
