package _array;

import java.util.Arrays;
import java.util.Scanner;

public class InputViaUser {
	public static void main(String[] args) {
		System.out.println("please enter the array");
		Scanner sc=new Scanner(System.in);
		
		// for taking input of array from user
		int [] a= new int[5];
		for (int i=0; i< a.length;i++) {
			a[i]= sc.nextInt();
		}
		
		// Retrieving the data
		System.out.println("displaying the array element one by one");
		for(int i=0; i< a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("array set");
		
		System.out.println(Arrays.toString(a));
		
	}

}
