package leetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ScannerIn{
	public static void test() throws IOException {
		 Scanner scan = new Scanner(System.in);	 	
		 	System.out.println("write integer");
	        int i = scan.nextInt();        	        
	        System.out.println("write double");
		 	double d = scan.nextDouble();	        
		 	scan.nextLine();
	        System.out.println("Write String");
		 	String s = scan.nextLine();	 	
		 	scan.close();
	        // Write your code here.	 	
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	}
//==========Alter way=====================================
	public static void test2() throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String r[]=new String[3];
			for(int i=0; i<3; i++){
				r[i] = br.readLine();
			}
			
			    System.out.println("String: "+r[2]);
				System.out.println("Double: "+Double.parseDouble(r[1]));
				System.out.println("Int: "+Integer.parseInt(r[0]));
	}
//==========Another way=====================================
	public static void test3() {
	        try{
	            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	            String s1 = br.readLine();
	            String s2 = br.readLine();
	            String s3 = br.readLine();
	            System.out.println("String: " + s3);
	            System.out.println("Double: " + Double.parseDouble(s2));
	            System.out.println("Int: " + Integer.parseInt(s1));            
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	}
}

public class C_fileReaderScanner {
	public static void main(String[] args) throws IOException {		
		ScannerIn.test();
	}
}
