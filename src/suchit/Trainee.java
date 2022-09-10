package suchit;

public class Trainee extends Employee{
	
	 public static void display() {
		 System.out.println(" display from Trainee");
	 }
	 
	
	 
	 public static void main(String[] args) {
		 Employee  employee = new Trainee();
		 employee.display();
		
	 }
	
}

 class Employee {
	public static void display() {
		System.out.println("display from Employee");
	}
	


}

 
// o/p----> display from Employee