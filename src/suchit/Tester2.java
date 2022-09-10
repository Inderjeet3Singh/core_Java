package suchit;

public class Tester2 {
	public static void main(String[] args) {
		Base1 obj= new Derived2();
		obj.method(); // asks for argument
	}

}

class Base1{
	public void method(int a) {
		System.out.println("Base Mehod");
	}
}

class Derived2 extends Base1{
	
	public void method() {
		System.out.println("Derived Method");
	}
}
 

// o/p---> compilation error