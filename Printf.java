package leetCode;

import java.util.Scanner;

class Printf2{
	public static void test() {
		Scanner scan = new Scanner(System.in);
		String[] s = new String[2];
		for(int i=0; i<s.length; i++) {
			s[i] = scan.nextLine();
			String st = s[i].toString();

			String[] word = st.split(" ");
			char[] ch = new char[12];
			for(int j=0; j<word[0].length(); j++) {
				ch[j] = word[0].toString().charAt(j); 
			}
			String word2 = String.valueOf(ch);
//			String str = String.format("%s %03d",word2, Integer.parseInt(word[1]));
			System.out.printf("%s %03d",word2, Integer.parseInt(word[1]));
		}
		scan.close();
	}
}

public class Printf {
	public static void main(String[] args) {
		Printf2.test();
	}
}
