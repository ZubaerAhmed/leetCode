package leetCode;

import java.util.Scanner;

class PrintfCopy2{
	public static void test() {
		Scanner scan = new Scanner(System.in);

		for(int i=0; i<2; i++) {		
                String s1 = scan.next();
                int x = scan.nextInt();
                //Complete this line
//                String str = String.format("%-11s %03d", s1, x);
//                System.out.println(str.length());
                System.out.printf("%-14s %03d", s1, x); 
                System.out.println();
            }

		scan.close();
	}
}

public class PrintfCopy {
	public static void main(String[] args) {
		PrintfCopy2.test();		
	}
}
