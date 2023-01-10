package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Penanda class HelloController adalah Controller
@RequestMapping("/hello") // Buat maping URL secara umum
public class HelloController {

	@RequestMapping("/home") // Buat maping URL secara khusus
	public String tampilkanHello() {
		return "hello-world.html"; // File HTML yang akan ditampilkan
	}
}

// localhost:8080/hello/home