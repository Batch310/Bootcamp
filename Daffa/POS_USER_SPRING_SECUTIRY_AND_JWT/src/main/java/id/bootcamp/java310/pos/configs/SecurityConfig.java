package id.bootcamp.java310.pos.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import id.bootcamp.java310.pos.jwt.AuthEntryPointJwt;
import id.bootcamp.java310.pos.jwt.AuthTokenFilter;
import id.bootcamp.java310.pos.services.JwtUserDetailService;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@Configuration
public class SecurityConfig {

	@Autowired
	JwtUserDetailService juds;

	@Autowired
	AuthEntryPointJwt aepj;

	@Bean
	public AuthTokenFilter authTokenFilter() {
		return new AuthTokenFilter();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(juds);
		authProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());

		return authProvider;
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.cors().and().csrf().disable().exceptionHandling().authenticationEntryPoint(aepj).and().authorizeRequests()
				.antMatchers("/api/user/login").permitAll().antMatchers("/api/user/**")
				.hasAnyRole("ADMIN", "WAREHOUSE", "CASHIER").antMatchers("/api/category/**")
				.hasAnyRole("ADMIN", "WAREHOUSE").antMatchers("/api/variant/**").hasAnyRole("ADMIN", "WAREHOUSE")
				.antMatchers("/api/product/**").hasAnyRole("ADMIN", "WAREHOUSE").antMatchers("/api/order/**")
				.hasAnyRole("ADMIN", "CASHIER").anyRequest().authenticated().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS);

		http.authenticationProvider(authenticationProvider());

		http.addFilterBefore(authTokenFilter(), UsernamePasswordAuthenticationFilter.class);
		
		return http.build();
	}

	@Bean
	public InMemoryUserDetailsManager userDetailServices() {
		List<UserDetails> roleList = new ArrayList<>();

		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("admin123456").roles("ADMIN")
				.build();

		UserDetails warehouse = User.withDefaultPasswordEncoder().username("warehouse").password("warehouse123456")
				.roles("WAREHOUSE").build();

		UserDetails cashier = User.withDefaultPasswordEncoder().username("cashier").password("cashier123456")
				.roles("CASHIER").build();

		roleList.add(admin);
		roleList.add(warehouse);
		roleList.add(cashier);

		return new InMemoryUserDetailsManager(roleList);
	}
}
