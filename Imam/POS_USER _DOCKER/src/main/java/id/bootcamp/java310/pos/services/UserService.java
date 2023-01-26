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
