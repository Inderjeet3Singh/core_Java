package _constructor;

public class No_Argument {
	int i;
	String s;
	float f;
	char c;
	
	No_Argument(){
		i=28;
		s="pradeep";
		f=85.26f;
		c='f';
		
	}
	
	void display() {
		
		System.out.println("value to integer :" + i);
		System.out.println("value to string :" + s);
		System.out.println("value to float :" + f);
		System.out.println("value to char :" + c);
		System.out.println(" ");
	}

}
