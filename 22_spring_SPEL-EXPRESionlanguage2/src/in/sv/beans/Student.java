package in.sv.beans;

public class Student {
     private String name;
     private float marks;
//     private Address Addres;
     private String hometown;
@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", hometown=" + hometown + "]";
	}
	 public String getHometown() {
		return hometown;
	}
	 public void setHometown(String hometown) {
		 this.hometown = hometown;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public float getMarks() {
		 return marks;
	 }
	 public void setMarks(float marks) {
		 this.marks = marks;
	 }
	
	
	
}
