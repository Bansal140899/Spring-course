package in.sv.resourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.sv.beans.Address;
import in.sv.beans.Student;

@Configuration
@ComponentScan(basePackages = "in.sv.beans")
public class SpringConfigFile {
	
	
}
