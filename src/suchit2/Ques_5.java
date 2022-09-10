package suchit2;

import java.util.ArrayList;
import java.util.List;

public class Ques_5 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		
		numbers.removeIf((a) ->{int a1=10; return a!=a1;});
		numbers.forEach((a) -> System.out.println(a));
	}

}

// o/p---> 10
