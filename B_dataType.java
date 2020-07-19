package leetCode;

import java.util.Scanner;

class HackerRankDataType{
	public static void test() {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++){
            try
            {
            	//double 32 bit
            	//float 32 bit, Default value is 0.0f, Example: float f1 = 234.5f
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x>=-128 && x<=127) {   //(x>=-Math.pow(2,7) && (x>=(-Math.pow(2,7)-1)
                	System.out.println("* byte \n* short \n* int \n* long");
                	
                }else if(x>=-Math.pow(2,15)  && x>=(-Math.pow(2,15)-1)){
                	System.out.println("* short \n* int \n* long");
                }else if(x>=-Math.pow(2, 31) && x<=(Math.pow(2,31)-1)) {
                	System.out.println("* int \n* long");
                }else if(x>=(-Math.pow(2, 63)) && x<=(Math.pow(2, 63)-1)){
                	System.out.println("* long");
                }
              
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
	}
	
}

public class B_dataType {

	public static void main(String[] args) {

		HackerRankDataType.test();

	}

}
