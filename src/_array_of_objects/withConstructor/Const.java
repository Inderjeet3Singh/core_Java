package _array_of_objects.withConstructor;

import java.util.Scanner;

public class Const {
	
	int id;
	String name;
	String course;
	int marks;
	
//	Const(int id, String name, String course,int marks){
//		this.id= id;
//		this.name= name;
//		this .course= course;
//		this.marks=marks;
//		
//	}
	
	void read() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		id=sc.nextInt();
		System.out.println("ente name");
		name=sc.next();
		System.out.println("enter course name");
		course=sc.next();
		System.out.println("enter marks");
		marks=sc.nextInt();
			
	}
	
	void display() {
		System.out.println("id of student :" + id);
		System.out.println("id of name :" + name);
		System.out.println("id of course :" + course);
		System.out.println("id of marks :" + marks);
	}

}
