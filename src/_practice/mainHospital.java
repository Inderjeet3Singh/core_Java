package _practice;

import java.util.Scanner;

public class mainHospital {
	private static paitent[] enterPaitent() {
		paitent[] p= new paitent[5];
		System.out.println("plz enter patient details name, age, add and mobile number");
		Scanner sc= new Scanner(System.in);
		for (int k=0;k<4;k++) {
			 System.out.println("enter paitent details");
		for (int i=0; i<5; i++) {
			 p[i]= new paitent("name :"+sc.next(),sc.nextInt(), sc.next(),sc.nextInt());
			 System.out.println("next paitent details");
			
		}
		
	}
		return p;
		
	}
	
	private static void displayPaitent(paitent[] p) {
		for (int i=0;i<5;i++) {
			p[i].display();
			
			System.out.println("");
		}
				
	}

	public static void main(String[] args) {
		
		
		paitent[] p= enterPaitent();
		displayPaitent(p);
		
		
	}

	

	
}
