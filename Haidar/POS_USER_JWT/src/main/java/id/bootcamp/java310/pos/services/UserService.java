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
	private BiodataRepository br;

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	public UserDTO login(String email, String password) {
		UserDTO dataUser = ur.login(email, password);

		if (dataUser != null) {
			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(email, password));
			
			SecurityContextHolder.getContext().setAuthentication(authentication);
			
			UserDetails userDetails = (UserDetails) authentication.getPrincipal();
			
			String token = jwtTokenUtil.generateToken(userDetails);
			dataUser.setToken(token);
		}

		return dataUser;
	}

	public void updateBiodata(ProfileDTO dto) {

		// Save email dan password pada tabel m_user (Berdasarkan query pada
		// UserRepostory)
		ur.updateEmailPassword(dto.getEmail(), dto.getPassword(), dto.getUser_id());

		// Ambil biodata_id berdasarkan user_id
		Long biodataId = br.getBiodataIdByUserId(dto.getUser_id());

		// Save Name & Phone pada tabel biodata (Berdasarkan query pada
		// BiodataRepostory)
		br.updateNamePhone(dto.getFullname(), dto.getPhone(), biodataId);

	}

}
