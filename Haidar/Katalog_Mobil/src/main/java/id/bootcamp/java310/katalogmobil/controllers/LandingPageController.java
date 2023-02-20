package id.bootcamp.java310.katalogmobil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("mobil")
public class LandingPageController {

	@RequestMapping("/home")
	public String home() {
		return "mobil/landing_page.html";
	}
}
