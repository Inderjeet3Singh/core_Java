package _javatest;

public class MainDriver {
	public static void main(String[] args) {
		
	
	
	ITstudent it1= new ITstudent(1001, "nathan", "bangalore", 26, "IT", "CDAC-BLR", new int[] {55,60,99} )  ;
	System.out.println("total marks :"+it1.findTotal());
	System.out.println("total percentage :" +it1.calculatePercentage());
	it1.findResult();
	it1.placementPercentage();
	System.out.println("");
	
	
	MathStudent math1= new MathStudent(1001, "nathan", "bangalore", 26, "IT", "CDAC-BLR", new int[] {40,40,20} )  ;
	System.out.println("total marks :"+math1.findTotal());
	System.out.println("total percentage :" +math1.calculatePercentage());
	math1.findResult();
	math1.placementPercentage();
	System.out.println("");
	
	
	MathStudent math2= new MathStudent(1001, "nathan", "bangalore", 26, "IT", "CDAC-BLR", new int[] {80,70,90} )  ;
	System.out.println("total marks :"+math2.findTotal());
	System.out.println("total percentage :" +math2.calculatePercentage());
	math2.findResult();
	math2.placementPercentage();
	}

}
