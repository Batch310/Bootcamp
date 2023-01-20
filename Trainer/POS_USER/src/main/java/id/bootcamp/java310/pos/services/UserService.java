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
	private BiodataRepository mBiodataRepository;

	public UserDTO login(String email, String password) {
		UserDTO dataUser = ur.login(email, password);
		return dataUser;
	}
	
	public void saveBio(ProfileDTO dto) {
		//Save Email & Password di tabel User
		ur.saveUser(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		//Ambil biodataID berdasarkan berdasarkan userId
		Long biodataId =
				mBiodataRepository.getBiodataIdFromUserId(dto.getUser_id());
		
		//Save Name & Phone
		mBiodataRepository.saveBiodata(dto.getFullname(), 
				dto.getPhone(), biodataId);;
	}
}
