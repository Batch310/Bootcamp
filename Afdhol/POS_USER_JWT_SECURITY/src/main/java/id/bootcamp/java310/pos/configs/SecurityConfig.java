package id.bootcamp.java310.pos.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import id.bootcamp.java310.pos.jwt.AuthEntryPointJwt;
import id.bootcamp.java310.pos.jwt.AuthTokenFilter;
import id.bootcamp.java310.pos.services.JwtUserDetailService;

@Configuration
@EnableGlobalMethodSecurity(
		prePostEnabled = true)
public class SecurityConfig {
	
	@Autowired
	JwtUserDetailService jwtUserDetailService;
	
	@Autowired
	AuthEntryPointJwt authEntryPointJwt;
	
	@Bean
	public AuthTokenFilter authTokenFilter() {
		return new AuthTokenFilter();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(jwtUserDetailService);
		authProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return authProvider;
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.cors().and().csrf().disable()
		.exceptionHandling().authenticationEntryPoint(authEntryPointJwt).and().authorizeRequests()
		.antMatchers("/api/user/login").permitAll()
		.antMatchers("/api/user/**").hasAnyRole("ADMIN","WAREHOUSE","CASHIER")
		.antMatchers("/api/category/**").hasAnyRole("ADMIN","WAREHOUSE")
		.antMatchers("/api/variant/**").hasAnyRole("ADMIN","WAREHOUSE")
		.antMatchers("/api/product/**").hasAnyRole("ADMIN","WAREHOUSE")
		.antMatchers("/api/order/**").hasAnyRole("ADMIN","CASHIER")
		.anyRequest().authenticated() // setelah permit all, harus autentifikasi
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		//no cache / session di API
		
		
		http.authenticationProvider(authenticationProvider());
		
		http.addFilterBefore(authTokenFilter(), UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}

}
