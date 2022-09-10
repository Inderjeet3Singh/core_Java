package asgm3._3;

import java.util.Scanner;

public class TestBank {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter bank name");
		String bname=sc.next();
		Bank b;
		
		b=  createBankObject(bname);
		b.display();
		b.simpleInterest();
		b.paid();
	}

	public static Bank createBankObject(String bname) {
		if (bname.equals("Sbi")) {
			System.out.println(bname + " bank is created");
			Bank b = new Sbi(1001,"jack",5000);
			return b;
		}else if (bname.equals("Axis")) {
			System.out.println(bname + " bank is created");
			Bank s= new Axis(1002,"jacky",50000);
			return s;
		}else if(bname.equals("Kotak")) {
			System.out.println(bname + "bank is created");
			Bank s= new Kotak(1003,"Vicky",400000);
			return s;
		}else { 
			System.out.println("wrong bank name");
			return null;
		}
		
	}

}
