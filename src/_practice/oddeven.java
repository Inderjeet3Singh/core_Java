package _practice;

public class oddeven {
	
	public static String OddEven(int n) {
		
	    String result;
		if (n%2 == 0) {
			result = "even";
		}else
			result = "odd";
		
		return result;
		
	
		
		
		
	}
	public static void main(String[] args) 
	
	{
		int num = 70;
        String result=OddEven(num);
	System.out.println(result);
		
	}
	
}
