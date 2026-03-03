package in.sv.main;

import in.sv.beans.Address;
import in.sv.beans.Student;

public class Main {
	public static void main(String[] args) {
		Address addr = new Address();
		addr.setHouseno(123);
		addr.setCity("Delhi");
		addr.setPincode(12345);
		
		Student std = new Student();
		std.setName("ajay");
		std.setRoll(1234);
		std.setAddress(addr);
		
		System.out.println(std.toString());
		
		
	}

}
