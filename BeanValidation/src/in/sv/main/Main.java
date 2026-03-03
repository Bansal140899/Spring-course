package in.sv.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import in.sv.beans.Student;
import in.sv.validator.StudentVlaidator;

public class Main {
	public static void main(String[] args) {
		String configLocation = "in/sv/resource/applicationContext.xml";
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		
		Student std = (Student) context.getBean("stdId");
		
		
		DataBinder dataBinder  = new DataBinder(std);
		dataBinder.addValidators(new StudentVlaidator());
		
		dataBinder.validate();
		List<ObjectError> list =dataBinder.getBindingResult().getAllErrors();
		
		if(list.isEmpty()) {
			System.out.println(std.toString());
			
		}else {
			for(ObjectError oe :list) {
				System.err.println(oe.getDefaultMessage());
			}
		}
		
		System.out.println(list);
//		
	}

}
