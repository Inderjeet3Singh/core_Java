package _practice;

public class StaticExample2 {
	static int i= m();
	
	static {
		System.out.println("inside static block");
	}

	static int m() {
		System.out.println("inside m");
		
		return 20;
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		System.out.println("value of a is :"+ i);
	}

}
