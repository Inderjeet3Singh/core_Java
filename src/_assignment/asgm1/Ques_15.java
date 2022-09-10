package _assignment.asgm1;

import java.util.Arrays;
import java.util.Scanner;

public class Ques_15 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		System.out.println("enter the elements of array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("array : " + Arrays.toString(arr));
//		Arrays.sort(arr);
//		
//		int max_sebd=arr[arr.length-2];
//		
//		System.out.println(max_sebd);
//		
		max2(arr);
	}

	static void max2(int[] arr) {
		int a = arr[0];
		int i = 0;
		int k = 0;
		for (i = 1; i < arr.length; i++) {
			if (arr[i] > a) {
				a = arr[i];
			}

		}
//		creation of an array skipping max ele from array: "arr"
		int[] b = new int[arr.length - 1];

		for (i = 0; i < (arr.length); i++) {
			if (a > arr[i]) {
				b[k++] = arr[i];

			}

		}
		System.out.println("array : " + Arrays.toString(b));
		// finding max element in array "b"
		int max = b[0];

		for (k = 1; k < b.length; k++) {
			if (b[k] > max) {
				max = b[k];
			}

		}
		System.out.println("2nd maximum element of array :" + max);

	}

}
