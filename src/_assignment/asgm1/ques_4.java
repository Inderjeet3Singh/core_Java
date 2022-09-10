package _assignment.asgm1;

public class ques_4 {
	
	public static String findevenodd(int n) {
		
		String result;
		if (n%2 == 0)
				{ result = "even";
				
				}
		else
		{	   result = "odd";
		
		}
		
		return result;
		
				
	}
	
	public static void main(String[] args) {
		
		int n = 37;
		String outcome= findevenodd(n);
		
		System.out.println(outcome);
	}

}
