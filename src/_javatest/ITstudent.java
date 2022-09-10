package _javatest;

public class ITstudent extends Students implements StudentInterface{
	
	String[] sub  = {"java", "python", "cpp"};
	int[] mark = new int[3];
	
	
	public ITstudent(int sid, String name, String address, int age, String courseName, String collegeName,int [] mark) {
		super(sid, name, address, age, courseName, collegeName);
		this.mark=mark;
	}

    public int findTotal(){
    	int sum=0;
    	for(int i=0;i<mark.length;i++) {
    		sum=sum+mark[i];
    	}
    	
    	return sum;
    	
    }
    
    public float calculatePercentage() {
    	
    	 int sum= findTotal();
    	
		   
 		return (float)sum/3;
    	
		 
	 }

	@Override
	public  void findResult() {
		if(mark[0]<40 || mark[1]<40 || mark[2]<40) {
			String s= "fail";
			System.out.println("student is " + s);
			
			
		}else {
			String s="pass";
			System.out.println("Student is "+ s);
		}
	}



	@Override
	public void placementPercentage() {
		
		if(calculatePercentage()>40) {
			System.out.println("eligible for placement");
		}else
			System.out.println("not eligible for placement");
		
	}
	
}
