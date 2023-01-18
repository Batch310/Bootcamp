package id.bootcamp.java310.pos.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {

	@RequestMapping("/login")
	public String showLoginPage(HttpServletRequest request) {
		return "user/login-template.html";
	}

	@RequestMapping("/user/home")
	public String showUserHome() {
		return "user/home-template.html";
	}
}