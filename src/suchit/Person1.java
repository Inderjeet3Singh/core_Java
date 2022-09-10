package suchit;

abstract class Person1 {
	
	public final void display() {
		System.out.println("Display method in person");
	}
	 
	public static void main(String[] args) {
		Person1 person = new Student1();
		person.display();
	}

}

 class Student1 extends Person1{
	 public void display() {// error at this line as final methods can not be override
			System.out.println("Display method in Student");
		}
	
}
