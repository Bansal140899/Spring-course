package in.sv.main;

import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("========date is indain formal======");
		Locale loacle1 = new Locale("en" ,"IN");
		DateFormat df1 = DateFormat.getDateInstance(0 ,loacle1);
		
		
		System.out.println(df1.format(date));
		
		
		System.out.println("========date is indain formal======");
		Locale loacle2 = new Locale("en" ,"US");
		DateFormat df2 = DateFormat.getDateInstance(0 ,loacle2);
		
		
		System.out.println(df2.format(date));
		
		
		System.out.println("========date is indain formal======");
		Locale loacle3 = new Locale("fr" ,"FR");
		DateFormat df3 = DateFormat.getDateInstance(0 ,loacle3);
		
		
		System.out.println(df3.format(date));
		
		
		
		
		
		
		
		
		
	}

}
