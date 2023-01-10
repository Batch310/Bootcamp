package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //penanda class HelloController itu Controller
@RequestMapping("/hello") // Buat mapping url secara umum
public class HelloController {
	
	@RequestMapping("/home") // Buat mapping secara khusus
	public String tampilkanHelloWorld() {
		return "hello-world.html"; // File html yang mau ditampilkan
	}
}

// localhost:8080/hello/home