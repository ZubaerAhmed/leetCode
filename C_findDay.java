package leetCode;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class C_findDay {
	 
    public static String test2(int year, int month, int day) throws IOException {
    	 String input_date = day + "/" + month + "/" + year;
 	     SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");	     
 	     SimpleDateFormat format2 = new SimpleDateFormat("EEEE"); 
 	     
 	     String final_day = null;
		try {
			final_day = format2.format(format1.parse(input_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
 	//     System.out.println(final_day.toUpperCase()); 
 	     return final_day.toUpperCase();
    }
	
	public static void test() throws ParseException {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, day);
		calendar.set(Calendar.MONTH, month - 1);
		calendar.set(Calendar.YEAR, year);
		String date = calendar.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, new Locale("en", "US")).toUpperCase();
		System.out.println(date);		
		 
	}
	
	public static void main(String[] args) throws IOException {
//		test();
		System.out.println(test2(2020,05,14));
	}

}
