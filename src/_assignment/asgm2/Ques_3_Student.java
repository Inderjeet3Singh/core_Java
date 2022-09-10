package _assignment.asgm2;

import java.util.Scanner;

public class Ques_3_Student {
	
	 
	
	int id;
	String name;
	int mark;
	String result; 
	
	
	public String result() {
		if (mark>40) {
			 result = "Pass"; 
		} else {
			result = "Fail";
		}
	return result;
		
		
	}
	 void display() {
		System.out.println("Id of student :" + id);
		System.out.println("Name of student :" + name);
		System.out.println("Marks of student :" + mark);
	    result = result();
		System.out.println("Result of student :" + result);
		
	}
	
	 void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id of student-");
		id= sc.nextInt();
		System.out.println("enter name of student");
		name= sc.next();
		System.out.println("enter marks of student");
		mark= sc.nextInt();
		
	}
	
	 public static void main(String[] args) {
		 
		 
		 Ques_3_Student s1 = new Ques_3_Student();
		 Ques_3_Student s2 = new Ques_3_Student();
		 s1.input();
		 System.out.println("-------------------------------" );
		 s2.input();
		
		
		
		 System.out.println("-------------------------------" );
	 
		 s1.display();
		 System.out.println("-------------------------------" );
		 s2.display();
		
	 }

}
