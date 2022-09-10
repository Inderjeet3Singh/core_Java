package suchit;

public class Test3 {
	
	public static void main(String[] args) {
		try {
			System.out.println("In try");
			return;
		}
		finally {
			System.out.println("in finally");
		}
		 System.out.println("otside block");
	}

}
