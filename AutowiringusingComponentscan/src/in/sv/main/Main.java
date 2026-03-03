package in.sv.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.support.ApplicationContext;

import in.sv.beans.Address;
import in.sv.beans.Student;
import in.sv.resourse.SpringConfigFile;

public class Main {
	public static void main(String[] args) {
		
//		ApplicationContext context = new AnnotationConfigApplicationContext("SpringConfigFile.java");
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
//		        new cpxac();
		
		
		Student std = (Student) context.getBean(Student.class);
		
        System.out.println(std.toString());
		
	}

}
