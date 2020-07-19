package leetCode;

import java.util.Scanner;

public class C_Constrints {
		
	static int B;
	static int H;
	static boolean flag = true; 
	

	static{ 
		Scanner scan = new Scanner(System.in);
		B = scan.nextInt();
		H = scan.nextInt();
		if(0>=B || 0>=H){ 
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} 
	}
//=================================================
	/*
	 * protected static boolean test() { 
	 * Scanner scan = new Scanner(System.in); 
	 * B = scan.nextInt(); 
	 * H = scan.nextInt(); 
	 * if(0<B && 0<H){ 
	 * flag = true; 
	 * }else {
	 * System.out.println("java.lang.Exception: Breadth and height must be positive"); 
	 * } return flag; 
	 * }
	 */
//=================================================
	public static void main(String[] args) {		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
