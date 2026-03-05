package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.beans.Student;
import in.sv.resource.SpringConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student) contex.getBean("stdId");
		
		System.out.println(std.toString());
	}

}
