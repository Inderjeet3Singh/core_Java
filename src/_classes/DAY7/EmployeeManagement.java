package _classes.DAY7;

import java.util.Scanner;

public class EmployeeManagement
{

	public static Employee[] addEmployee()
	{
		
		
         Employee[] e = new Employee[2];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter two object value");
		for(int i = 0;i<2;i++)
		{
							
			e[i] = new Employee(s.nextInt(),s.next(),s.nextFloat(),s.next());
						
		}
		return e;
		
	}

	public static void disEmployee(Employee[] e) 
	{
		System.out.println("employee details");
		
		for(int i = 0;i<2;i++)
		{
			
			if(e[i]!=null)
			{
			e[i].displayEmployee();
			}
			
			System.out.println(" ");
				
			
						
		}
		
	}

	public static void updateEmployee(Employee[] e) 
	{
		System.out.println("enter the empno ");
		
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		System.out.println("enter the sal to update ");
		int sal = s.nextInt();
		
		
		
		for(int i = 0;i<2;i++)
		{
							
			if(e[i].eno == no )
			{
				e[i].esal = sal;
			}
				
			
						
		}
		
		
		System.out.println("salary updated");
		disEmployee (e);
		
		
		
		
	}

	public static void deleteEmployee(Employee[] e)
	
	{
      System.out.println("enter the empno  to delete");
		
		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		
		for(int i = 0;i<2;i++)
		{
							
			if(e[i].eno == no )
			{
				e[i]= null;
			}
				
			
						
		}
		
		
		
	}
	
}

