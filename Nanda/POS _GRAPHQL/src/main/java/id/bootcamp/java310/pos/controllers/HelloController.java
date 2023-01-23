package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Penanda class hellocontroller itu controller
@RequestMapping("/hello") //buat mapping url secara umum
public class HelloController {

	@RequestMapping("/home") //buat mapping url secara khusus
	public String tampilkanHelloWorld() {
		return "hello.html"; //file HTML yang mau ditampilkan
	}
}

// localhost:8080/hello/home