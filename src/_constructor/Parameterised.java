package _constructor;

public class Parameterised {
	int i;
	String s;
	float f;
	char c;
	
	Parameterised(int i, String s, float f, char c){
		this.i=i;
		this.s=s;
		this.f=f;
		this.c=c;
		
	}
	
	void display() {
		
		System.out.println("value to integer :" + i);
		System.out.println("value to string :" + s);
		System.out.println("value to float :" + f);
		System.out.println("value to char :" + c);
		System.out.println(" ");
	}


}
