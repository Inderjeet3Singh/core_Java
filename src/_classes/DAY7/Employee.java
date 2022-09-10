package _classes.DAY7;

import java.util.Scanner;

class Employee
{
	int eno;
	String ename;
	float esal;
	String edesig;
	static String companyName;
			
	
	
	Employee(int no,String name, float sal,String desig )
	{
		
	eno = no;
	ename = name;
	esal = sal;
	edesig = desig;
	
	
	}
	
		void displayEmployee()
	{
		System.out.print(eno + " " + ename+ " " + esal+ " " + edesig + " "+companyName );
	}
	
		
		static void changeCompany()
		{
			companyName = "CDAC";
			
			
		}
	
		
		
		void findBonus()
		{
			float bonus;
			if(esal>300000)
				 bonus = esal*.02f;
			else
				 bonus = esal*.01f;
			System.out.println(bonus);
				
		}
		

				
		
}



 





