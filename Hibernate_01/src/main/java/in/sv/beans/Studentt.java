package in.sv.beans;

public class Studentt {
	private int id;
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
  private String name;
  private int roll;
  private String city;
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
  public Studentt() {
	super();
	this.name = name;
	this.roll = roll;
	this.city = city;
}
  public void setCity(String city) {
	this.city = city;
  }
  @Override
  public String toString() {
	return "Student [name=" + name + ", roll=" + roll + ", city=" + city + "]";
  }
  
  

}
