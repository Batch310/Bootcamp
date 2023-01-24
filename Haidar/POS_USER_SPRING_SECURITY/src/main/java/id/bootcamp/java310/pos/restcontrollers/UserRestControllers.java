package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import id.bootcamp.java310.pos.dto.MenuDTO;
import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.services.BiodataService;
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
	
	@Autowired
	private BiodataService bs;
	
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
	
	@GetMapping("/profile")
	public Resp<ProfileDTO> getProfile(
			@RequestParam("user_id") Long userId) {
		// Mengemas Response API
		int code = 200;
		String message = "Success";
		ProfileDTO profileUser = bs.getProfile(userId);
		if (profileUser == null) {
			code = 11;
			message = "Profile User tidak ditemukan!";
		}
		
		
		Resp<ProfileDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(profileUser);
		
		return response;
	}
	
	@PutMapping("/upload")
	public Resp<String> getUpload(@RequestParam("file") MultipartFile file, 
			@RequestParam("user_id") Long userId) {
		
		Resp<String> response = new Resp<>();
		response.setCode(200);
		response.setMessage("Upload Success");

		String imagePath = bs.uploadPicture(file, userId);
		response.setData(imagePath);
		
		return response;
	}
	
	@PutMapping("/saveBiodata")
	public Resp<String> saveBiodata(@RequestBody ProfileDTO dto) {
		
		Resp<String> response = new Resp<>();
		response.setCode(200);
		response.setMessage("Save Biodata Success");
		
		us.updateBiodata(dto);
		
		return response;
		
	}
	
}
