package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.beans.Student;
import in.sv.resource.springconfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(springconfig.class);
		
		Student std = (Student) context.getBean("stdId");
		
		
		System.out.println(std.toString());
		
	}

	
}
