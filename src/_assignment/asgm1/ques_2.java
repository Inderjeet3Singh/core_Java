package _assignment.asgm1;

public class ques_2 {
	
	public static void addOfDigit(int n) {
		int i;
		int sum = 0;
		for(i=n; i>0; i=i/10)
		{
			
			int x = i%10;
			sum = sum + x;
		}
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args)
	
	{
		
		int n = 31;
		addOfDigit(n);
	}
	
	

}
