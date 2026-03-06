package in.sv.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import in.sv.aspect.Login;
import in.sv.service.App;

@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {
	
	@Bean
	public App ap1() {
		App a1 = new App();
		return a1;
	}
	
	@Bean
	public Login l1() {
		Login l11 = new Login();
		return l11;
		
	}
	
	

}
