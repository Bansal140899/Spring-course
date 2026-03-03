package com.Syntaxved.bean;

public class Student {
   private String name;
   private int rollno;
   private String pro;
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
   public String getPro() {
	return pro;
   }
   public void setPro(String pro) {
	this.pro = pro;
   }
   
   public void display() {
	   System.out.println("name of the student :" + name);
	   System.out.println("rollno of the student :" + rollno);
	   System.out.println("pro of the student :" + pro);
	   
   }
}
