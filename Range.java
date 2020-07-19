package leetCode;

import java.util.Scanner;

class Range2{
	public static void test() {
		Scanner scanner = new Scanner(System.in);
		  int N = scanner.nextInt();
	      //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(!(N%2==0)){
	        	System.out.println("Weired");
	        }else if(N%2==0 && (2<=N && N<=5)){
	            System.out.println("Not Weird");
	        }else if(N%2==0 && (N>=6 && N<=20)) {
	        	System.out.println("Weird");
	        }else if(N%2==0 && N>20) {
	        	System.out.println("Not Weird");
	        }
	        scanner.close();
	}
}


public class Range {

	public static void main(String[] args) {
		Range2.test();

	}

}
