package in.sv.main;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();
//		
//		System.out.println("defaulte locale : "+locale);
//		System.out.println(locale.getDisplayCountry());
//		System.out.println(locale.getCountry());
//		System.out.println(locale.getDisplayLanguage());
//		System.out.println(locale.getLanguage());
		
		
		System.out.println("=========================");
		
		Locale local2 = new Locale("fr" ,"FR");
		
		System.out.println("defaulte locale : "+local2);
		System.out.println(local2.getDisplayCountry());
		System.out.println(local2.getCountry());
		System.out.println(local2.getDisplayLanguage());
		System.out.println(local2.getLanguage());
		
		
		
		System.out.println("+++++++++++++++++++++====================");
		
		Locale l = new Locale("hi");
		
		String[] countrycode_arr = Locale.getISOCountries();
		for(String countryCode : countrycode_arr) {
			
			Locale locale = new Locale("" ,countryCode);
		
			System.out.println(countryCode + "==>"+ locale.getDisplayCountry()  +"==>"+ locale.getDisplayCountry(l));
			
			System.out.println();
		}
		
		
	}

}
