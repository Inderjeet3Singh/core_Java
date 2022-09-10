package _assignment.asgm1;
// 12.	Write a Java program to sum values of an array.

public class Ques_12 {
public void practice() {
	
	
	
}

public static void main (String [] args) {
	
//	int[] mark = {10, 20,30, 40, 50};
//	int m=0;
//	for(int i=0; i<mark.length; i++) {	 m = m + mark[i];
//		
//		
//	}
//	System.out.println( m);
	
	int [] marks;
	marks= new int[20];
	marks[0]=10;
	marks[1]=20;
	marks[2]=30;
	marks[3]=40;
	marks[4]=50;
	marks[5]=0;
	
	int m=0;
	for(int ele:marks) 
	{	
		m = m + ele;
		
		
	}
	System.out.println( m);
	

}

}
