package _assignment.asgm2;

import java.util.Scanner;

public class Ques_4_Account {
	
	int accno;
	String accname;
	float amount;
	
	Scanner sc =new Scanner(System.in);
	
	void withdraw() {
		System.out.println("enter amount you want to withdraw");
		
		int a = sc.nextInt();
		if (a<amount) {
		amount = amount - a;
		}else {
			System.out.println("balance not available");
		}
		
		System.out.println("remaining balance is :" + amount);
	}
	
	void deposit() {
		System.out.println("enter amount you want to deposit");
		int a = sc.nextInt();
		amount = amount + a;
	
		System.out.println(" balance available is :" + amount);
		
	}
	
	void interest() {
		
		
	}
	
	
	public static void main(String[] args) {
		
		Ques_4_Account a1 = new Ques_4_Account();
		a1.accno = 1008;
		a1.accname = " Abhi";
		a1.amount = 20000;
		
		a1.withdraw();
		a1.deposit();

		
	}

}
