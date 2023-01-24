package id.bootcamp.java310.pos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller             //Penanda class HelloController itu Controller
@RequestMapping  ("/hello")       //Buat mapping URL secara umum(Buat fitur)
public class HelloController {
	
	@RequestMapping("/home")    //Buat mapping URL Secara khusus
	public String tanpilkanHelloWorld() {
		return "hello-world.html";         //membalikkkan file Html(utk ditampilkan)
		
	}

}
