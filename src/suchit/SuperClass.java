package suchit;

public class SuperClass {
	 private void displayName() {
		System.out.println("Super class");
	}
	
	public static void main(String[] args) {
		SuperClass superClass = new SubClass();
		superClass.displayName();
		
	}

}

 class SubClass extends SuperClass{
	private void displayName() {
		System.out.println("Subclass is a type of SperClass");
	}
	
}

 
 // o/p---> Super class