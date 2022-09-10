package _date;

import java.time.LocalDateTime;

//Import the DateTimeFormatter class
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {
	
	public static void main(String[] args) {
		LocalDateTime obj = LocalDateTime.now();
		System.out.println("Before formatting : " + obj);
		
		DateTimeFormatter objFormat= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = obj.format(objFormat);
		System.out.println("After formatting : " +formattedDate);
				
	}

}
