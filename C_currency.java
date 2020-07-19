package leetCode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class C_currency {
	
	public static double currencyInput() {
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		scan.close();
		return payment;
	}
		public static void currency() {
			double payment = currencyInput();
			 String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		     String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		     String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		     String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		     
		     System.out.println("US: " + us);
		     System.out.println("India: " + india);
		     System.out.println("China: " + china);
		     System.out.println("France: " + france);
		}
	        
		public static void currency2() {
			double payment = currencyInput();
			NumberFormat payment2 = NumberFormat.getNumberInstance();
			String payment3 = payment2.format(payment); 
			System.out.println(payment3); 
			String[] country = {"US", "India", "China", "France"};
			String[] currency = {"$", "Rs.", "¥", "€"};
			
			for(int i=0; i<country.length-1; i++) {
				System.out.println(country[i]+": "+currency[i]+payment3);
			}
			System.out.println(country[3]+": "+payment3+" "+currency[3]);			
		}
	
 
	
	public static void main(String[] args) {

		currency();
		System.out.println("");
		//====call any one method====
		//currency2();
	}

}
