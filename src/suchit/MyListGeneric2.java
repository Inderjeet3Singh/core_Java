package suchit;

import java.util.ArrayList;
import java.util.List;

public class MyListGeneric2 <Object>{
	private List <Object> values = new ArrayList<>();
	public void add(Object value) {
		values.add(value);  // line1
		System.out.println(values);
		
	}
	public static void main(String[] args) {
		MyListGeneric2 <String>  myListString= new MyListGeneric2<String>();
		 myListString.add("Good");
	}
	

}
 // o/p--->[Good]