package com.Syntaxved.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;

import com.Syntaxved.bean.Student;

@Configuration
public class JavaConfig {

	@Bean (name = {"std" ,"std1" ,"std2"})
	public Student creatstd() {
		Student std = new Student();
		std.setName("ajay");
		std.setPro("java developer");
		std.setRollno(855141);
		 
		return std;
		
	}
	
}
