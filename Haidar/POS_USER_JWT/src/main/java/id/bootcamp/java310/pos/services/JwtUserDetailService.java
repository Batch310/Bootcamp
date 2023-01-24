package id.bootcamp.java310.pos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import id.bootcamp.java310.pos.entities.UserEntity;
import id.bootcamp.java310.pos.repositories.UserRepository;

@Service
public class JwtUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = ur.getUserByEmail(username);
		if (user != null) {
			String roleCode = ur.getRoleCodeByEmail(username);
			String password = user.getPassword();		
			GrantedAuthority mRole = new SimpleGrantedAuthority("ROLE_" + roleCode);

			List<GrantedAuthority> roleList = new ArrayList<>();
			roleList.add(mRole);
			
			return new User(username, password, roleList); 
		} else {
			throw new UsernameNotFoundException("User not found with email: " + username);
		}
	}
	
}
