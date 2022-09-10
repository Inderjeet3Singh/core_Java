package fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ForExample4 {
	
	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("baba.txt");
		BufferedReader br= new BufferedReader(fr);
		
		String currentLine = br.readLine();
		while(currentLine != null) {
			
			System.out.println(currentLine);
			currentLine=br.readLine();
			
		}
		br.close();
		fr.close();
		
		
		
	}

}
