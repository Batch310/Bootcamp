package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // Anotasi. Penanda class HelloController merupakan Controller, bukan class biasa. Harus ada ini, kalau tidak maka url (RequestMapping) tidak terbaca
@RequestMapping("/hello") // Buat mapping URL secara umum
public class HelloController {

	@RequestMapping("/home") // Buat mapping URL secara khusus
	public String tampilkanHelloWorld() {
		return "hello-world.html"; // File html yang mau ditampilkan
	}
}
// localhost:8080/hello/home