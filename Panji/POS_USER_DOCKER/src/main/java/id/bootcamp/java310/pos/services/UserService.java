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
	
	public void saveBiodata(ProfileDTO dto) {
		
		// Simpan email & password 
		ur.updateBiodataUser(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		// ambil biodata id berdasarkan userId
		Long biodataId = br.getBiodataIdFromUserId(dto.getUser_id());
		
		// save name & phone
		br.updateBiodata(dto.getFullname(), dto.getPhone(), biodataId);
	}
}
