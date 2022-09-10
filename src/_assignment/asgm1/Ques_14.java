package _assignment.asgm1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_14 {
public static void main(String[] args) {
	int[] arr= new int[5];
	System.out.println("enter the element of array");
	Scanner sc = new Scanner(System.in);
	for(int i=0; i<5; i++) {
		arr[i]=sc.nextInt();
	}
	 System.out.println(Arrays.toString(arr));
	rev(arr);
}

 static void rev(int[] arr) {
	 
	 int[] b=new int[arr.length];
	 int k=0;
	 
	 for(int i = (arr.length-1); i>=0; i-- ) {
		 
		 b[k++]=arr[i]; 
		 
	 }
	// for(int i=0; i<b.length; i++)
		// System.out.print(b[i]+" ");
	 
	 System.out.println("reverse of array is :" +Arrays.toString(b));
 }
}
