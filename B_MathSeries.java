package leetCode;

import java.util.Scanner;

class HackerRank2{
	public static void test() {
		
		 Scanner sc = new Scanner(System.in);
	        int length = sc.nextInt();
	        for(int i=0; i<length; i++){
	            int a = sc.nextInt();
	            int b = sc.nextInt();
	            int n = sc.nextInt();
	            
	            for(int j =0;j<n; j++) {
	                System.out.print(getValue(a,b,j)+" ");
	            }
	            System.out.println();
	            for(int j =0;j<n;j++) {
	                System.out.print(getValue2(a,b,j)+" ");
	            }
	        }
	    }
	    
	    static int getValue(int a,int b, int j) {  	
	        int sum = a;
	        for(int i=j; i>=0; i--) {
	            sum = sum + ((int) Math.pow(2,i))*b; 
	        }
	        return sum;
	    }
	    
	    static int getValue2(int a,int b, int j) {
	    	
	        int sum = a;
	        for(int i=0; i<=j; i++) {
	            sum = sum + ((int) Math.pow(2,i))*b; 
	        }
	        return sum;
	    }
	
}

public class B_MathSeries {

	public static void main(String[] args) {

		HackerRank2.test();

	}

}
