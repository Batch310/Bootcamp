package id.bootcamp.java310.pos.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@RequestMapping("/login")
	public Resp<UserDTO> login(
		@RequestParam("email") String email,
		@RequestParam("password") String password){
		int code = 200;
		String message = "Login Sukses";
		
		UserDTO dataUser = us.login(email, password);
		
		if(dataUser==null) {
			code = 11;
			message = "Email atau Password salah !";
		}
		
		Resp<UserDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(dataUser);
		
		return response;
	}
	
	@GetMapping("/menu")
	public Resp<List<MenuDTO>> menu(@RequestParam("role_code") String role_code){
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		List<MenuDTO> data = ms.menu(role_code.trim());	
		Resp<List<MenuDTO>> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
						
	@GetMapping("/profile")
	public Resp<ProfileDTO> profile(@RequestParam("user_id") Long user_id){
		// Mengemas Response API
		int code = 200;
		String message = "Sukses";
		ProfileDTO data = bs.profile(user_id);	
		Resp<ProfileDTO> response = new Resp<>();
		response.setCode(code);
		response.setMessage(message);
		response.setData(data);
		
		return response;
	}
	@PutMapping("/upload")
	public Resp<String> getUpload(@RequestParam("file") MultipartFile file,
		@RequestParam("user_id") Long userId){
		Resp<String> response =  new Resp<>();
		response.setCode(200);
		response.setMessage("Sukses");
		
		String imagePath = bs.upload(file, userId);
		response.setData(imagePath);
		return response;
	}
	
	@PutMapping("/updateBiodata")
	public Resp<String> uploadBiodata(@RequestBody ProfileDTO dto){
		Resp<String> response =  new Resp<>();
		response.setCode(200);
		response.setMessage("Sukses");
			
		us.updateBio(dto);
		
		return response;
	}
	
}
