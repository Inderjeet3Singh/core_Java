package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ForExample1 {
	// write in file
	
	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("ex1.txt",true);
		Scanner sc= new Scanner(System.in);
		
		System.out.println("write file content and write exit to stop");
		
		//using iterator to write the content of the file.
		
	    String str =null;
		while(!(str =sc.nextLine()).equals("exit")) {
			
			fw.write(str+ "\n");
		
		}
		
		
		fw.close();
		System.out.println("ex:1 is done");
	}

}
