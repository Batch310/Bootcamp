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
	public void updateBiodata(ProfileDTO dto) {
		//save email & password di table user
		ur.updateUser(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		//Ambil biodata id berdasarkan userid
		long biodataId = br.getbiodataIdFromUserId(dto.getUser_id());
		
		// save name dan phone
		br.updateBiodata(dto.getFullname(), dto.getPhone(), biodataId);
	}
	
}
