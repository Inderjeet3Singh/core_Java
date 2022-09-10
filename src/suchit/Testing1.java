package suchit;

public class Testing1 {
	
	public static void main(String[] args) {
		MyInterface obj= new MyImplementation();
		obj.method1();
		
	}

}

interface MyInterface{
	 void method1();
}

class MyImplementation implements MyInterface{
	
	   void method1() {
		System.out.println("My Mehod");
	}
}

// o/p----> compilation error: cannot reduce the visibility of inherited method
