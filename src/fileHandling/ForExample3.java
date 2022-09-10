package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("baba.txt");
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the content you want to save and write exit to save");
		
		String str= null;
		while(!(str=sc.nextLine()).equals("exit")) {
			fr.write(str);
		}
		
		fr.close();
	}

}
