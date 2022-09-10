package _object_creation.assigning_value;

public class ByConstructor {
	int i;
	String s;
	float f;

	ByConstructor(int i, String s, float f) {
		this.i = i;
		this.s = s;
		this.f = f;
	}

	void display() {
		System.out.println(" value of int :" + i);
		System.out.println(" value of string :" + s);
		System.out.println(" value of float :" + f);
	}

}

class main1 {
	public static void main(String[] args) {
		ByConstructor c = new ByConstructor(26, "Vicky", 77.72f);
		ByConstructor d = new ByConstructor(27, "baba", 69.69f);
		c.display();
		d.display();
	}
}


