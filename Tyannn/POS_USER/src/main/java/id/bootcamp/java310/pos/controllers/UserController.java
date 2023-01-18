package id.bootcamp.java310.pos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import id.bootcamp.java310.pos.dto.UserDTO;

@Controller
public class UserController {

	@RequestMapping("/login")
	public String showLoginPage(HttpServletRequest request) {
		String email = (String) request.getSession().getAttribute("email");

		if (email != null) {
			return "redirect:/user/home";
		} else {

			return "user/login.html";
		}
	} 

	@RequestMapping("/user/home")
	public String showUserHome(HttpServletRequest request, Model model) {
		String email = (String) request.getSession().getAttribute("email");

		//ambil data dari session
		String name = (String) request.getSession().getAttribute("name");		
		String roleCode = (String) request.getSession().getAttribute("role_code");		
		String profilePicture = (String) request.getSession().getAttribute("profile_picture");
		
		//Ngoper ke file htmlnya
		model.addAttribute("name",name);
		model.addAttribute("role_code",roleCode);
		model.addAttribute("profile_picture",profilePicture);
		
		
		if (email != null) {
			return "user/home.html";
		} else {

			return "redirect:/login.html";
		}
	}

	@RequestMapping("user/saveLoginData")
	@ResponseBody // mengembalikan sesuai return kita
	public String saveLoginData(UserDTO dto, HttpServletRequest request) {

		request.getSession().setAttribute("email", dto.getEmail());
		request.getSession().setAttribute("user_id", dto.getUser_id());
		request.getSession().setAttribute("name", dto.getName());
		request.getSession().setAttribute("profile_picture", dto.getProfile_picture());
		request.getSession().setAttribute("role_code", dto.getRole_code());

		return "/user/home";
	}
	
	@RequestMapping("/user/deleteLoginData")
	@ResponseBody
	public String deleteLoginData(HttpServletRequest request) {
		request.getSession().invalidate();	
		return "/login";
	}
	
	
	
	
	
}