package in.sv.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sv.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean("stdId")
	public Student std() {
		Student std1 = new Student("bansal" ,"855141" ,"kota");
		
		return std1;
		
		
	}

}
