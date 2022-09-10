package _assignment.asgm2;

import java.util.Scanner;

public class Emp{
	int empno;
	String empname;
	String designation;
	String dept;
	float sal;
	
	
	void readEmpData() {
		Scanner sc = new Scanner(System.in);
		empno= sc.nextInt();
		empname=sc.next();
		designation= sc.next();
		sal=sc.nextFloat();
		
	}
	
	void displayEmpData() {
		System.out.println(
				"employee ID :" + empno + "\n" +
				"employee name :" + empname + "\n" +
				"employee designation :" + designation + "\n" +
				"employee dept :" + dept + "\n" +
				"employee sal :" + sal + "\n" );
		
	}

}
 
