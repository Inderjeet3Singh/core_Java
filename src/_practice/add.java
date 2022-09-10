package _practice;

public class add {
	//indrjeet
	
	public static int add(int a, int b)
	{
		int sum = a+b;
		return sum;
		
	}
	public static int multi(int a, int b) {
		int multiply= a * b;
		return multiply;
		
	}
	public static void main(String[] args)
	{
		
    int a= 56;
	int b= 56;
	int addition = add(a,b);
	int multiplication = multi(a,b);
	System.out.println("addition is " + addition);
	System.out.println("multiplication is " + multiplication);
	
} 
}