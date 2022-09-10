package _date;
 //import the LocalDate class
import java.time.LocalDate;
// import the localdatetime class
import java.time.LocalDateTime;
//import the LocalTime class
import java.time.LocalTime;

public class LocalDates {
	
	public static void main(String[] args) {
		
		// display current date
		LocalDate date =  LocalDate.now(); // Create a date object
		System.out.println(date); // display current date
		
		// display current time
		LocalTime time= LocalTime.now();// create a time object
		System.out.println(time); // display current time(hr, min, sec, ns)
	 
		// display current Date and time
		LocalDateTime dateTime = LocalDateTime.now();
		// format (2022-06-19T12:45:58.921751)
	
	
	}

}
