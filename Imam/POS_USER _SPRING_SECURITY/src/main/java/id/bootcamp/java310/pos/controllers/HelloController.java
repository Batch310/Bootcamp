package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Penanda class HelloController itu Controller
@RequestMapping("/hello") //Buat mapping URL secara umum
public class HelloController {

	@RequestMapping("/home") //Buat Mapping URL secara khusus
	public String tampilkanHelloWorld() {
		return "hello-world.html"; //File HTML yang mau ditampilkan
	}
}