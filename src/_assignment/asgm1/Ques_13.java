package _assignment.asgm1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_13 {
	public static void main(String[] args) {
		System.out.println("enter the number of elements you want in array");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("enter the elements in array");
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			}
	
		System.out.println("array :"+ Arrays.toString(arr));

		max(arr);
		min(arr);

	}

	static void max(int[] arr) {
		

		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("maximum element of array is :" + max);

	}

	static void min(int[] arr) {
		int min= arr[0];

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] < min) {
				min = arr[j];
			}

		}
		System.out.println("minimum element of array is :" + min);

	}
}
