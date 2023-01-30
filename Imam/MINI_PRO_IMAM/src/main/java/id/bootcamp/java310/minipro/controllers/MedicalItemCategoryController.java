package id.bootcamp.java310.minipro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class MedicalItemCategoryController {

	@RequestMapping("/home")
	public String home() {
		
		return "medicalCategory/medicalCategory-pisah.html";
	}
}
