package in.sv.beans;

public class Student {

	
	  private String name;
	  private int rollno;
	  private String phoneno;
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public int getRollno() {
		  return rollno;
	  }
	  public void setRollno(int rollno) {
		  this.rollno = rollno;
	  }
	  public String getPhoneno() {
		  return phoneno;
	  }
	  public void setPhoneno(String phoneno) {
		  this.phoneno = phoneno;
	  }
	  @Override
	  public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", phoneno=" + phoneno + "]";
	  }
	  
	  
	
}
