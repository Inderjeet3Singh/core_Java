package suchit;

import java.util.ArrayList;
import java.util.List;

public class MyListGeneric<T extends Number>{
	 private List<T> values = new ArrayList<>();
	 
	 public void add(T value) {
		 values.add(value);
		 System.out.println(values);
	 }
	 
	 public void remove(T value) {
		 values.remove(value);
	 }
	 
	 public T get (int index) {
		 return values.get(index);
		 
	 }
	 
	 public static void main(String[] args) {
		MyListGeneric<Float> myList= new MyListGeneric<Float>();
		myList.add(98.7f);
		myList.add(1009);
	}
	

}

// o/p---> The code will lead to a compilation error in the line "myList.add(1009)"
