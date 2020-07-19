package leetCode;

import java.util.Scanner;

public class D_singleton {
	
	public static String str; 
	public static String s; 
	public static D_singleton instance;
	
	private D_singleton(String a){
		System.out.printf("Let me say %s to you\n" , a);
		s = "Hello I Am a String Part of Singleton Class";
	}
    
//	public static D_singleton getInstance() {
	public static D_singleton D_singleton() { 
		if(instance == null) {
			synchronized (D_singleton.class) {
				if(instance == null) {
					instance = new D_singleton(str);
				}
			}			
		}
		return instance;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine(); 

//		D_singleton.getInstance();      		
		D_singleton.D_singleton(); 
				
		D_singleton a = D_singleton.D_singleton();
		String aa = a.s.toUpperCase();
		System.out.println(aa);  
		
		D_singleton b = D_singleton.D_singleton();
		String bb = a.s.toLowerCase();
		String cc = b.s.toLowerCase();
		System.out.println(bb); 
		System.out.println(cc);
		//checking same object or not
		System.out.println(a);
		System.out.println(b); 
	}

}
  