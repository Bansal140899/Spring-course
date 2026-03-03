 package in.sv.beans;

public class Address {
	private int  Houseno;
	private String city;
	private int pincode;
	
	public Address(int houseno, String city, int pincode) {
		super();
		Houseno = houseno;
		this.city = city;
		this.pincode = pincode;
	}

	public String toString() {
		return "Address [Houseno=" + Houseno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
