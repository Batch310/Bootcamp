package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.repositories.ProfileRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class BiodataService {

	@Autowired
	private ProfileRepository pr;
	
	public ProfileDTO profile(Long user_id) {
		ProfileDTO dataProfile = pr.getProfile(user_id);
		return dataProfile;
	}
	
}
