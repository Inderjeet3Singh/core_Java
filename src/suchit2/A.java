package suchit2;

public class A {
  public static int dataOne=123;
  private static int dataTwo=456;
}

class B extends A{
	
	public static void getAcess() {
		System.out.println(dataOne);
		System.out.println(dataTwo);
	}
	
}  


/// line no. 3