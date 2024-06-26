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
			@RequestParam ("email") String email,
			@RequestParam ("password") String password){
		
		int code = 200;
		String message = "Login Sukses";
		UserDTO dataUser = us.login(email, password);
		
		if(dataUser==null) {
			code=11;
			message="Email atau password salah";
		}
		
		Resp<UserDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(dataUser);
		
		return response;
	}
	
	//menu
	@GetMapping("/menu")
	public Resp<List<MenuDTO>> menuBar(
			@RequestParam ("role_code") String role_code){
		
		int code = 200;
		List<MenuDTO> menuBar = ms.getMenu(role_code);
		
		Resp<List<MenuDTO>> response = new Resp<>();
		response.setCode(code);
		response.setData(menuBar);
		
		return response;
	}
	
	@GetMapping("/profile")
	public Resp<ProfileDTO> profile(
			@RequestParam ("user_id") Long userId){ //param yang akan digunakan pada POSTman
		
		int code = 200;
		String message = "Sukses";
		ProfileDTO userID = bs.getProfile(userId);
		
		if(userID==null) {
			code=11;
			message="profile tidak ditemukan";
		}
		
		Resp<ProfileDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(userID);
		
		return response;
	}
	
	@PutMapping("/upload")
	public Resp<String> getUpload(
			@RequestParam("user_id") Long userId,
			@RequestParam("file") MultipartFile file){
		
		Resp<String> response = new Resp<>();
		response.setCode(200);
		response.setMessage("Sukses aplod...");
		
		String imagePath = bs.upload(file, userId);
		response.setData(imagePath);
		
		return response;
	}
	
	@PutMapping("/saveBiodata")
	public Resp<String> saveBiodata(@RequestBody ProfileDTO dto){
		Resp<String> response = new Resp<>();
		response.setCode(200);
		response.setMessage("Sukses ...");
		
		us.saveBiodata(dto);
		
		return response;
	}
}
