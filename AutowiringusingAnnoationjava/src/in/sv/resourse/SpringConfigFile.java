package in.sv.resourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sv.beans.Address;
import in.sv.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddobj() {
		
		Address addr = new Address();
		addr.setHouseno(123);
		addr.setCity("delhi");
		addr.setPincode(12245);
		
		return addr;
	}
	@Bean
	public Student creatStdObj() {
		Student std = new Student();
		std.setName("ajay");
		std.setRoll("12333");
//		std.setAddress(createAddobj());
		
		return std;
	}

}
