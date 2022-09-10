package _object_creation.assigning_value;

import java.util.Scanner;

public class ByMethod {
	int i;
	String s;
	float f;

	void display() {
		System.out.println(" value of int :" + i);
		System.out.println(" value of string :" + s);
		System.out.println(" value of float :" + f);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of object");

		System.out.println("enter value of int");
		i = sc.nextInt();

		System.out.println("enter value of string");
		s = sc.next();

		System.out.println("enter value of flaot");
		f = sc.nextFloat();

	}

}

class main2 {
	public static void main(String[] args) {
		ByMethod a = new ByMethod();
		a.input();
		a.display();
		
		System.out.println("--------------------------");

		ByMethod b = new ByMethod();
		b.input();
		b.display();

	}
}
