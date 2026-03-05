package in.sv.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sv.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("/in/sv/resource/applicationContext.xml");
		
		Student std = (Student) contex.getBean("stdId");
		
		System.out.println(std.toString());
	}

}
