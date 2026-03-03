package in.sp.main;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sv/resource/applicationContext.xml");
		Student std = (Student) context.getBean("stdId");
		
		System.out.println(std.toString());
	}

}
