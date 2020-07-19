package leetCode;

import java.util.Scanner;

public class C_convertStringToInteger {
	
	static {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = null; 
		if(n>=-100 && n<=100) {
			s = Integer.toString(n);
		}
			try {
			 if (n == Integer.parseInt(s)) {
				    System.out.println("Good job");
				   } else {
				    System.out.println("Wrong answer.");
				   }
			} catch (Exception e) {
				System.out.println("Unsuccessful Termination!!");
				  }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
