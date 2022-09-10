package _object_creation.assigning_value;

public class ByReference {
	int i;
	String s;
	float f;

	void display() {
		System.out.println(" value of int :" + i);
		System.out.println(" value of string :" + s);
		System.out.println(" value of float :" + f);
	}


}

class main3{
	public static void main(String[] args) {
		
		ByReference a= new ByReference();
		a.i= 26;
		a.s= "baba";
		a.f=2.85f;
		
		a.display();
		
		ByReference b= new ByReference();
		b.i= 28;
		b.s= "babu";
		b.f=96.85f;
		
		b.display();
	}
}