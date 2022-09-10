package _ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		// add() method to add elements to the ArrayList
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Bannana");
		fruits.add("Berry");
		fruits.add("Kiwi");
		fruits.add("Melon");
		
		// accessing the ArrayList Object it will give the element name in Array format
		System.out.println(fruits);
		
		// get(index): to access an element 
		fruits.get(1);
		System.out.println(fruits.get(1));
		
		// to change an item use set(index, element)
		fruits.set(5, "Watermelon");
		System.out.println(fruits.get(5));
		
		// to remove an element use remove(index);
		fruits.remove(5);
		System.out.println(fruits);
		
		//to get the number of elements in arrayList use size();
		System.out.println(fruits.size());
		
		//to remove all elements use clear()
//		fruits.clear();
//		System.out.println(fruits);
		
		//looping through array list
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		//looping using for-each loop
		for(String s:fruits) {
			System.out.println(s);
		}
	}

}
