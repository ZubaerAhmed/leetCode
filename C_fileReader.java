package leetCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class C_fileReader {

	public static void main(String[] args) throws IOException {

		// reading a file line by line before Java 8 
		File file = new File("src\\leetCode\\HackerRank.txt"); 
		  
		BufferedReader br2 = new BufferedReader(new FileReader(file)); 		  
		String st; 
		while ((st = br2.readLine()) != null) {
			  System.out.println(st);
		}
//=================================================
		System.out.println("=======================");	  
		// reading file line by line in Java 8
		Files.lines(Paths.get("C:\\Users\\Zubaer\\Desktop\\HackerRank.txt"))
			.forEach(System.out::println);
//=================================================
		Scanner input = new Scanner(System.in);
		int lines = 1;
		while (true)
		{
			String line = input.nextLine();
			System.out.println(lines + " " + line);
			lines++;
			if (!input.hasNext())
			{
				break;
			}
		}
		input.close();
//===============================================		
		   Scanner input2 = new Scanner(System.in);
	        int lineNo = 0;
	        while (input2.hasNextLine()) {
	            lineNo++;
	            System.out.println(lineNo+" "+input2.nextLine());
	        }
//================================================
	     Scanner s=new Scanner(System.in);
	     int i=0;
	     while(s.hasNextLine()) {
	          i++;
	          System.out.println(i+ " "+s.nextLine());            
	        }
//================================================
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        Integer count=1;
        while (true){
            str=br.readLine();
            if(str==null){
                break;
            }
            System.out.println(count++ +" "+str);
        }
	}

}
