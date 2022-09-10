package _practice;

public class StaticExample {
	
	static int b;
	static int a =5;
	
	static{
		b=a*4;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}
