package _assignment.asgm1;

import java.util.Scanner;

public class ques_10 {
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	public static void main(String[] args) {
		
		int flag=0;
		while(flag==0) {
			
		
		System.out.print(" enter first number : ");
		int a = input();
		
		System.out.print(" enter second number : ");
		int b = input();
		
		System.out.println(" select one of the following operations");
	
		System.out.println(" + " + " - " + " * " + " / ");
		System.out.println("to exit enter 0 ");
		 
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.nextLine();
	
		
		switch(str) {
			
			case("+"): System.out.println(a + " +" + b + " = " + (a+b) );
			break;
			case("-"): System.out.println(a + " -" + b + " = " + (a-b) );
			break;
			case("/"): System.out.println(a + " /" + b + " = " + (a/b) );
			break;
			case("*"): System.out.println(a + " x" + b + " = " + (a*b) );
			break;
			case("0"): flag=1;
			break;
			default: System.out.println("please select above mention operations");
			
		}
		
		}
		
		
	}

}
