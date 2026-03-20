package in.sp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@ComponentScan("in.sp.controller")
public class WebSecurityConfig  extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
.antMatchers("/bbb").hasRole("ADMIN").and().httpBasic();
	    

	
	}
	
	
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
	
		UserDetails ud = User.withUsername("admin").password("$2a$12$ZEZ2QSOrww3vOaL3HnzKneV9PkGVE.dLfh1AzEM6c0duDxh7M1MWe").roles("ADMIN").build();
		
		
		InMemoryUserDetailsManager manger = new InMemoryUserDetailsManager();
		
		manger.createUser(ud);
		return manger;
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	
		return new BCryptPasswordEncoder();
		
	}
	
	
	
	
	
	

}
