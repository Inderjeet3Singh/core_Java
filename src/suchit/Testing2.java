package suchit;

public class Testing2 {
	public static void main(String[] args) {
		
		BaseAbsClass obj= new Derived3();
		obj.method2();
		
	}

}

abstract class BaseAbsClass{
	public void method() {
		System.out.println("BaseAbsClass method");
	}
	
	public abstract void method2();
}

class Derived3 extends BaseAbsClass{

	@Override
	public void method2() {
		System.out.println("Derived method");
		
	}
	
}
