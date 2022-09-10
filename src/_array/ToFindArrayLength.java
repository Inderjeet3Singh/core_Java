package _array;

public class ToFindArrayLength {
	
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,60,70};
		
		int l=0;
		
		for(int i=0;i<a.length;i++) {
			l++;
		}
		
		System.out.println("length of array :"+ l);
	}
}
