package id.bootcamp.java310.pos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
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
	public String showUserHome(HttpServletRequest request) {
		String email = (String) request.getSession().getAttribute("email");

		if (email != null) {
			return "user/home-template.html";
		} else {
			return "redirect:/login";
		}
	}

	@RequestMapping("login/saveLoginData")
	@ResponseBody // Mengembalikan sesuai return kita, bukan template.html
	public String saveLoginData(UserDTO dto, HttpServletRequest request) {
		request.getSession().setAttribute("email", dto.getEmail());
		request.getSession().setAttribute("user_id", dto.getUser_id());
		request.getSession().setAttribute("name", dto.getName());
		request.getSession().setAttribute("profile_picture", dto.getProfile_picture());
		request.getSession().setAttribute("role_code", dto.getRole_code());
		return "/user/home";
	}
}