package _ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class UseFulMethods {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<Integer>();
		arr.add(50);
		arr.add(80);
		arr.add(70);
		arr.add(40);
		arr.add(20);
		arr.add(90);
		
		for(Integer i:arr) {
			System.out.println(i);
		}
		
		System.out.println("\nafter sorting");
		//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
	    Collections.sort(arr);
	    for(Integer i:arr) {
			System.out.println(i);
		}
	    
	}

}
