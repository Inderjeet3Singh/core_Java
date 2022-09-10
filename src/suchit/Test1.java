package suchit;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		List<Long> l1= new ArrayList<Long>();
		l1.add(Long.valueOf(10));
		List<Number> l2= l1;
		System.out.println(l2);
	}

}
 // compile time error
//  it will ask to change the type of l2