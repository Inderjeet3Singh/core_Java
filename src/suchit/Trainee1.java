package suchit;

public class Trainee1 extends Employee1{
	public void display(String name) { //line 2
		System.out.println(name);
	}
	
	public int print(int age) { //line 5
		System.out.println(" Trainee ");
		return age;
	}
   
	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		trainee.display(); //line 10
		trainee.display("Bob"); //line 11
		trainee.print(10);//line 12
	}
}

class Employee1{
	public void display() {
		System.out.println(" display ");
	}
	
	public void print(int age) {
		System.out.println(" Emplyee ");
	}
}
 // o/p---> compile error at line 5