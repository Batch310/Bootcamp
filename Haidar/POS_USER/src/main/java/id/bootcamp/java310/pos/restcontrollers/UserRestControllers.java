package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.services.MenuService;
import id.bootcamp.java310.pos.services.UserService;
import id.bootcamp.java310.pos.utils.Resp;

@RestController
@RequestMapping("api/user")
public class UserRestControllers {
	
	@Autowired
	private UserService us;
	
	@Autowired
	private MenuService ms;
	
	@PostMapping("/login")
	public Resp<UserDTO> login(
			@RequestParam("email") String email, 
			@RequestParam("password") String password) {
		// Mengemas Response API
		int code = 200;
		String message = "Login Berhasil";
		UserDTO dataUser = us.login(email, password);
		
		//Validasi jika user tidak ditemukan / gagal login
		if(dataUser == null) {
			code = 11;
			message = "Email atau Password salah!";
		}

		Resp<UserDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(dataUser);

		return response;
	}
	
	@GetMapping("/menu")
	public Resp<List<MenuDTO>> menuBar(
			@RequestParam("role_code") String roleCode) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		List<MenuDTO> menuBar = ms.menuBar(roleCode);
		
		Resp<List<MenuDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(menuBar);

		return response;
	}
	
}
