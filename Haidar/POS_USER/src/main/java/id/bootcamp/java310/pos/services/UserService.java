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
		
		//Save email dan password pada tabel m_user (Berdasarkan query pada UserRepostory)
		ur.updateEmailPassword(dto.getEmail(), dto.getPassword(), dto.getUser_id());
		
		//Ambil biodata_id berdasarkan user_id
		Long biodataId = br.getBiodataIdByUserId(dto.getUser_id());
		
		//Save Name & Phone pada tabel biodata (Berdasarkan query pada BiodataRepostory)
		br.updateNamePhone(dto.getFullname(), dto.getPhone(), biodataId);
		
	}
	
}
