package leetCode;

import java.util.Scanner;

class TwoSum {
	public static void main(String[] arg) {
		//TwoSum.two_sum();
		//System.out.println(TwoSum.two_sum());
		System.out.println(twoSum());
	}
	//================================================
	public static int[] twoSum() { 		
		int[] nums = {2, 8, 7, 11, 15};
		for(int i=0; i<nums.length-1; i++) {
			for(int j=1; j<nums.length; j++) {
				if((nums[i] + nums[j]) == 9){				
					System.out.println(nums[i]+":index-"+i+", "+nums[j]+":index-"+(j));
					//return String.format("[%d, %d]",nums[i], nums[j]);
					//return String.format("[%d, %d]", i, j);

				}
			}
		}
		return null;      
	}
	//-----------------------------------------------
	public static String two_sum() { 		
		Scanner s = new Scanner(System.in);
		int size = 4;
		int[] nums = new int[size]; 
		System.out.println("Enter elements of array");
		for(int i=0; i<size; i++) {
			nums[i] = s.nextInt();
		}
		
        int target; 
        System.out.println("Target:");
        target = s.nextInt();
        
        int[] ans = new int[2];
		
		for(int i=0; i<nums.length-1; i++) {
			if((nums[i] + nums[i+1]) == 9){				
				ans[0] = i;
                ans[1] = i+1;
            
			}

		}
		return String.format("[%d, %d]",ans[0], ans[1]);
     }
}

