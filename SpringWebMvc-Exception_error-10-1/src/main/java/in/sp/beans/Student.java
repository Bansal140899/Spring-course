package in.sp.beans;

import javax.validation.constraints.NotEmpty;

public class Student {
	@NotEmpty
	private String name;
	private String email;
	private String pass;
	private String gender;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", pass=" + pass + ", gender=" + gender + ", city=" + city
				+ "]";
	}
	

}
