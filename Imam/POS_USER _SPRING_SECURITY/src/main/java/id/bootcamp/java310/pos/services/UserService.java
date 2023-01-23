package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private BiodataRepository br;
	
	public UserDTO login(String email, String password) {
		UserDTO dataUser = ur.login(email, password);
		
		if(dataUser.getRole_code().equals("ADMIN")) {
			dataUser.setUsernameAuth("admin");
			dataUser.setPasswordAuth("admin123456");	
		}else if(dataUser.getRole_code().equals("WAREHOUSE")) {
			dataUser.setUsernameAuth("warehouse");
			dataUser.setPasswordAuth("warehouse123456");	
		}else if(dataUser.getRole_code().equals("CASHIER")) {
			dataUser.setUsernameAuth("cashier");
			dataUser.setPasswordAuth("cashier123456");	
		}
		
		
		return dataUser;
	}
	
	public void saveBio(ProfileDTO dto) {
		
		//SAVE DI TABEL USER
		ur.saveUser(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		//Ambil biodataID berdasar user id
		Long biodataId = br.getBiodataIdFromUserId(dto.getUser_id());
		
		//SAVE NAME $ PHONE
		br.saveBiodata(dto.getFull_name(), dto.getPhone(), biodataId);
	}
	
}
