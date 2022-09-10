package suchit;

public class Tester {
	public static void main(String[] args) {
		Base obj= new Derived();
		obj.method(25);
	}

}

class Base{
	public  void method(int a) {
		System.out.println(" Base method");
	}
}

class Derived extends Base{
	public void method(int a) {
		System.out.println(" Derived method");
	}
	
}

//o/p = derived method
