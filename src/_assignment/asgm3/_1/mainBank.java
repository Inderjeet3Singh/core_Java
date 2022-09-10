package _assignment.asgm3._1;

import java.util.Scanner;

public class mainBank {
	
	public static void main (String[] args) {
		checkingAccount c1= new checkingAccount(101,50000,1);
		savingAccount s1= new savingAccount(102,50000,5);
		
		Scanner sc= new Scanner(System.in);
		int menu;
		
		 do
		{
			System.out.println("select from below mention options");
			System.out.println("1 for Savings account");
			System.out.println("2 for checking account");
			System.out.println("0 for Exit");
			
			
			
			 menu = sc.nextInt();
			switch(menu)
					{
						case 0 : System.out.println("Thank You For Banking with us..!");
						break;
						case 1: int j;
						do
						{
						System.out.println("welcome to savings account");
						System.out.println("Enter Your Choice");
						System.out.println("1 for deposit");
						System.out.println("2 for withdraw");
						System.out.println("3 for getbalance");
						System.out.println("4 for add interest");
						System.out.println("0 back to main menu");
						
						j=sc.nextInt();
						switch(j)
						{
						case 1 : s1.deposit();
						break;
						case 2 : s1.withdraw();
						break;
						case 3 : s1.getbalance();
						break;
						case 4 : s1.addInterest();
						break;
						case 0 : System.out.println("back to main menu");
						break;
						default:System.out.println("invalid choice");
						}
						}
						while(j !=0);
					
						break;
						case 2:  int k;
						do
						{
						System.out.println("welcome to savings account");
						System.out.println("Enter Your Choice");
						System.out.println("1 for deposit");
						System.out.println("2 for withdraw");
						System.out.println("3 for getbalance");
						System.out.println("4 for deduct fee");
						System.out.println("0 for main menu");
						
						k=sc.nextInt();
						switch(k)
						{
						case 1 : c1.deposit();
						break;
						case 2 : c1.withdraw();
						break;
						case 3 : c1.getbalance();
						break;
						case 4 : c1.deductfee();
						break;
						case 0 : System.out.println("back to main menu");
						break;
						default:System.out.println("invalid choice");
						}
						}
						while(k !=0);
						break;
					
						
						default : System.out.println("Invalid Choice..!");
						break;
					}
				
			}while (menu != 0);
		
	
	}
	}


