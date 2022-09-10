package _assignment.asgm1;

import java.util.Scanner;

public class ques_9 {
	
	public static int print() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	public static void main (String[] args) {
		System.out.println("enter first number");
		int a = print();
		
		System.out.println("enter second number");
		int b = print();
		
		System.out.println("enter third number");
		int c = print();
		
		if (a>b && a>c) {
			System.out.println(a + " is greatest number of all three");
		}else if (b>a && b>c) {
			System.out.println(b + " is greatest number of all three");
		}else {
			System.out.println(c + " is greatest number of all three");
			
		}
	}

}