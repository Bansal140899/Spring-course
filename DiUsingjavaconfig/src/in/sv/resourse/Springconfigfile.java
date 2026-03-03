package in.sv.resourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sv.beans.Address;
import in.sv.beans.Student;

@Configuration
public class Springconfigfile {
	
	@Bean
	public Address createAddrObj() {
		Address addr = new Address(123 ,"kota" ,787);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student("ajay" ,"123" ,createAddrObj());
		return std;
	}
	

}
