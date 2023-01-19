package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.repositories.BiodataRepository;

@Service
public class BiodataService {
	@Autowired
	private BiodataRepository br;
	
	public ProfileDTO getProfile(Long user_id) {
		ProfileDTO profile = br.profile(user_id);
		return profile;
	}
}
