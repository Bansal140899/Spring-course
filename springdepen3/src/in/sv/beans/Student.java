package in.sv.beans;

public class Student {
	private String name;
	private String roll;
	private Address Address;
	
	
	public Student(String name, String roll, in.sv.beans.Address address) {
		super();
		this.name = name;
		this.roll = roll;
		Address = address;
	}


	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", Address=" + Address + "]";
	}
	

}
