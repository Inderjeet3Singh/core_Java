package suchit2;

public class Test3 {
	public static void main(String[] args) {
		System.out.println(testing(1,1));
		
	 
	}
	static int testing(int a,int b) {
		
		try {
			return a / b;
		}
		catch (ClassCastException e) {
			return 10;
		}
		catch (RuntimeException e) {
			return 20;
		}
		finally {
			return 30;
		}
		
	}
}


//o/p---> 30

