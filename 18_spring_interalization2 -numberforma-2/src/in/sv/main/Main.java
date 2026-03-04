package in.sv.main;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();

		
		
		
//		int no1 = 123345678;
//		
//		double no2 = 98765.43210;
//		
//		System.out.println("=================below is indian ");
//		Locale locale1 = Locale.getDefault();
//		NumberFormat nf1 = NumberFormat.getInstance(locale1);
//		System.out.println(nf1.format(no1));
//		System.out.println(nf1.format(no2));
//		
//		
//		
//		System.out.println("=================below is francee ");
//		Locale locale = Locale.FRANCE;
//		NumberFormat nf2 = NumberFormat.getInstance(locale);
//		System.out.println(nf2.format(no1));
//		System.out.println(nf2.format(no2));
//		
		
		
		
		
		
		
		
		
		int no1 = 123345678;
		
		double no2 = 98765.43210;
		
		System.out.println("=================below is indian ");
		Locale locale1 = Locale.getDefault();
		
		Currency currency = Currency.getInstance(locale1);
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(locale1);
		System.out.println(nf1.format(no1));
		System.out.println(nf1.format(no2));
		
		
		
		System.out.println("=================below is francee ");
		Locale locale = Locale.FRANCE;
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf2.format(no1));
		System.out.println(nf2.format(no2));
		
		
		
	}

}
