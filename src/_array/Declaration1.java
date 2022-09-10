package _array;

import java.util.Arrays;

public class Declaration1 {
	public static void main(String[] args) {
		// declaration of array
		int[] mark = new int[5];

		// Initialization
		mark[0] = 5;
		mark[1] = 6;
		mark[2] = 7;
		mark[3] = 8;
		mark[4] = 9;
		
		// to retrieve an array
	
		for(int i=0;i<mark.length;i++) {
			
			
			System.out.println(mark[i]);
			
		    
		}
		
		// way to make in array
            System.out.println(Arrays.toString(mark));
	}

}
