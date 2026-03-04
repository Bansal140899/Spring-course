package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.beans.Student;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	ApplicationContext context = new ClassPathXmlApplicationContext("in/resource/ApplicationContext.xml");
	
	Student std = (Student) context.getBean("stdID");
	std.
	
	

}
