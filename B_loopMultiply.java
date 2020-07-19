package leetCode;

import java.util.Scanner;

class HackerRank{
	public static void multiply() {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(N +" x "+ i +" = " + N*i);
		}
		scan.close();
	}
}

public class B_loopMultiply {
	public static void main(String[] args) {

		HackerRank.multiply();
	}

}
