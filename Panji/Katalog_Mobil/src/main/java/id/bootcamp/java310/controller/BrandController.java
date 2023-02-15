package id.bootcamp.java310.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class BrandController {

	@RequestMapping("/menu")
	public String menuUtama() {
		return "landing-page.html";
	}
}
