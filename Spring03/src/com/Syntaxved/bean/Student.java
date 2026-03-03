package com.Syntaxved.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("ajay")
	private String name;
	@Value("12345")
   private int rollno;
	@Value("codeerrrrr")
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
