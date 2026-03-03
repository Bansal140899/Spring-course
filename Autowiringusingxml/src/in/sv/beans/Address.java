 package in.sv.beans;

public class Address {
	private int  Houseno;
	private String city;
	private int pincode;
	
	
//	public int getHouseno() {
//		return Houseno;
//	}
//
//	public void setHouseno(int houseno) {
//		Houseno = houseno;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public int getPincode() {
//		return pincode;
//	}
//
//	public void setPincode(int pincode) {
//		this.pincode = pincode;
//	}
//
//	
	
	



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