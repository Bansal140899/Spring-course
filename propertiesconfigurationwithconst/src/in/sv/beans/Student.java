package in.sv.beans;

public class Student {
	private String name;
	private int roll;
	private float marks;
	
	public Student(String name ,int roll ,float marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}

	
	
	 public void display() {
		 System.out.println("nAme : "+name);
		 System.out.println("rollno : "+roll);
		 System.out.println("marks : "+marks);
	 }
}
