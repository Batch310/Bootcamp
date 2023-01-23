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
	private BiodataRepository bRepo;
	
	public UserDTO login(String email, String password) {
		UserDTO dataUser = ur.login(email, password);
		
		if(dataUser.getRole_code().equals("ADMIN")) {
			dataUser.setUsernameAuth("admin");
			dataUser.setPasswordAuth("admin123456");
		} else if(dataUser.getRole_code().equals("WAREHOUSE")) {
			dataUser.setUsernameAuth("warehouse");
			dataUser.setPasswordAuth("warehouse123456");
		} else if(dataUser.getRole_code().equals("CASHIER")) {
			dataUser.setUsernameAuth("cashier");
			dataUser.setPasswordAuth("cashier123456");
		}
		
		return dataUser;
		
	}
	
	public void userBio(ProfileDTO dto) {
		//Save Email dan Password di tabel user
		ur.userData(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		//Ambil biodataId berdasarkan userId
		Long biodataId = bRepo.getBiodataIdFromUserId(dto.getUser_id());
		
		//Save name dan phone
		bRepo.userData(dto.getFullname(), dto.getPhone(), biodataId);
	}
	
}
