package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.support.ApplicationContext;

import in.sv.beans.Address;
import in.sv.beans.Student;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/sv/resourse/applicationContext.xml");
		
		
		Student std = (Student) context.getBean("stdId");
		
        System.out.println(std.toString());
		
	}

}
