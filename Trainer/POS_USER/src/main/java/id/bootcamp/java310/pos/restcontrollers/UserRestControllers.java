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

	@PostMapping("/login")
	public Resp<UserDTO> login(@RequestParam("email") String email, @RequestParam("password") String password) {
		int code = 200;
		String message = "Login Success";
		UserDTO dataUser = us.login(email, password);
		
		// Validasi jika user tidak ditemukan / gagal login
		if (dataUser == null) {
			code = 11;
			message = "Email atau Password salah!";
		}

		Resp<UserDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(dataUser);

		return response;
	}
	
	@Autowired
	private MenuService ms;

	@PostMapping("/login")
	public Resp<UserDTO> login(@RequestParam("email") String email, @RequestParam("password") String password) {

		int code = 200;
		String message = "Login sukses";
		UserDTO dataUser = us.login(email, password);

		// Validasi jika user tidak ditemukan / gagal login
		if (dataUser == null) {
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
	public Resp<List<MenuDTO>> getMenu(@RequestParam("role_code") String roleCode) {

		int code = 200;
		String message = "sukses";
		List<MenuDTO> dataUser = ms.getMenu(roleCode);


		Resp<List<MenuDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(dataUser);

		return response;
	}

}
