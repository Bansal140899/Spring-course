package in.sv.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private String roll;
	@Autowired
	private Address Addres;
	
	



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRoll() {
		return roll;
	}


	public void setRoll(String roll) {
		this.roll = roll;
	}


	public Address getAddress() {
		return Addres;
	}


	public void setAddress(Address address) {
		this.Addres = address;
	}





	





//public Student(String name, String roll, Address addres) {
//	super();
//	this.name = name;
//	this.roll = roll;
//	Addres = addres;
//}
public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", Address=" + Addres + "]";
}
	

}
