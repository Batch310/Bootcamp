package id.bootcamp.java310.pos.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.antMatchers("/api/user/login").permitAll()
				.antMatchers("/api/user/**").hasAnyRole("ADMIN", "WAREHOUSE", "CASHIER")
				.antMatchers("/api/category/**").hasAnyRole("ADMIN", "WAREHOUSE")
				.antMatchers("/api/variant/**").hasAnyRole("ADMIN", "WAREHOUSE")
				.antMatchers("/api/product/**").hasAnyRole("ADMIN", "WAREHOUSE")
				.antMatchers("/api/order/**").hasAnyRole("ADMIN", "CASHIER")
				.anyRequest().authenticated()
				.and()
				.httpBasic()
				.and()
				.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
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
