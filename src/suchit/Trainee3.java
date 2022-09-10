package suchit;

public class Trainee3 extends Employee3 {
	protected void display() {
		System.out.println("Trainee");
	}
	
	public static void main(String[] args) {
		Employee3 emp= new Trainee3();
		emp.display(); // line 10
		
	}

}


abstract class Employee3{
	private void display() {
		System.out.println("Employee");
	}
}

// compile error at line 10;