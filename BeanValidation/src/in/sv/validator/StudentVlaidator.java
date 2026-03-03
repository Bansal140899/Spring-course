package in.sv.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.sv.beans.Student;

public class StudentVlaidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		Student std = (Student) target;
		
		if(std.getName().equals("") || std.getName().equals("null")) {
			errors.rejectValue("name", "key_name" ,"Name is not Valid ");;
		}
		if(std.getRollno() == 0) {
			errors.rejectValue("rollno", "key_roll" ,"roll not is not 0");
		}
		if(std.getPhoneno().length()  != 10) {
			errors.rejectValue("phoneno", "key_phoneno" ,"phone no is not valid");
		}
		
		
		
	}

}
