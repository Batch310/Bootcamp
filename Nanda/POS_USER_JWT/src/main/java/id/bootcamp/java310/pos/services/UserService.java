package id.bootcamp.java310.pos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.dto.ProfileDTO;
import id.bootcamp.java310.pos.dto.UserDTO;
import id.bootcamp.java310.pos.jwt.JwtTokenUtil;
import id.bootcamp.java310.pos.repositories.BiodataRepository;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private BiodataRepository bRepo;
	
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	public UserDTO login(String email, String password) {
		UserDTO dataUser = ur.login(email, password);
		
		if(dataUser != null) {
			Authentication auth = authManager.authenticate(
					new UsernamePasswordAuthenticationToken(email, password));
			
			SecurityContextHolder.getContext().setAuthentication(auth);
			
			UserDetails userDetails = (UserDetails) auth.getPrincipal();
			
			String token = jwtTokenUtil.generateToken(userDetails);
			dataUser.setToken(token);
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
