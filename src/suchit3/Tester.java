package suchit3;

import java.util.ArrayList;
import java.util.List;

public class Tester<T> {
	
	private List<T> books = new ArrayList<>();
	
	//line1
	@SafeVarargs
	private final void add(T... toadd) {
		for(T book: toadd) {
			books.add(book);
		}
	}
	//line2
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		// line3
		@SuppressWarnings("rawtypes")
		Tester t = new Tester();
		t.add("Java11", "Docker", "DataJPA");
		System.out.println(t.books);
	}

}

/// option c---> @SafeVarargs //line1 @SuppressWarnings("unchecked") @SuppressWarnings("rawtypes")
