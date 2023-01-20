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
		String roleCode = (String) request.getSession().getAttribute("role_code");
		Long userId = (Long) request.getSession().getAttribute("user_id");

		// Oper roleCode
		model.addAttribute("AHLANWASAHLAN", userId);
		if (roleCode == null) {
			return "redirect:/login";
		} else if (roleCode.equals("CASHIER") || roleCode.equals("ADMIN")) {
			return "order/order-template.html";
		} else {
			return "redirect:/user/home";
		}
	}
	
}
