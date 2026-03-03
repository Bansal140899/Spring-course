package in.sv.beans;

public class Student {
	private String name;
	private int roll;
	private Address Address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int i) {
		this.roll = i;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", Address=" + Address + "]";
	}
	

}
