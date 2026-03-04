package in.sv.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sv.beans.Address;
import in.sv.beans.Student;

@Configuration
public class springconfig {
	
	@Bean
	public Address addrid() {
		Address addr = new Address();
		addr.setHometown("kota");
		addr.setHometown("1234555");
		
		return addr;
		
	}
	
	@Bean
	public Student stdId(@Value("#{addrid.hometown}") String hometown) {
		Student std = new Student();
		std.setName("ajay");
//		std.setHometown(addrid().getHometown());
		std.setHometown(hometown);
		
		return std;
		
		
	}

}
