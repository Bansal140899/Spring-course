package in.sv.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import in.sv.bean.Student;
import in.sv.dao.StudentDao;
import in.sv.dao.StudentDaoImp;
import in.sv.dbcon.DbConnection;

public class Main {
	public static void main(String[] args) {
		
		Student std = new Student();
		std.setCity("delhiiiii");
		std.setId(98);
		std.setName("king");
		
		
		

		StudentDao stddao = new StudentDaoImp();
		boolean status = stddao.addStudentdetails(std)
;	
		
		
		if(status=true) {
			System.out.println("succes");
		}else {
			System.out.println("failed");
		}
	 }
}
