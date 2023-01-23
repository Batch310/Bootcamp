package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@ adalah anotasi
@Controller //import Controller, sebagai penanda bahwa classnya adalah Controller
@RequestMapping("/hello") //digunakan untuk mapping url secara umum, untuk urlnya

public class HelloController {

	@RequestMapping("/home") //membuat mapping url secara khusus
	public String tampilkanHelloWorld() {
		return "hellowrld.html"; //menampilkan file html yang telah dibuat
	}
}
