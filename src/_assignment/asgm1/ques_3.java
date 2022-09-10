package _assignment.asgm1;

public class ques_3 {
	
	public static void revofnumber(int n) {
		
		int i;
		int sum=0;
		for(i=n; i>0; i=i/10) {
			int x;
			x = i % 10;
			
			sum = x + sum*10;
			
		}
		
		System.out.println(sum);
	}
      public static void main(String[] args) {
    	  
    	  int n = 356;
    	  revofnumber(n);
      }
      
}
