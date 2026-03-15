package in.sv.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_reg")
public class Employee {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
  private int id;
	
	@Column(name="emp_name")
  private String name;
	@Column(name="emp_roll")
  private int roll;
	@Column(name="emp_city")
  private String city;

  @Override
  public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", city=" + city + "]";
  }
  
  

}
