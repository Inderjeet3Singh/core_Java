package _assignment.asgm3._4.Car;

public class TestCar {

	public static void main(String[] args) {
		Maruti m= new Maruti(1001,"blue");
		Alto a= new Alto(1002,"yellow");
		Brezza b= new Brezza(1003,"red");
		
		m.speed();
		m.display();
		System.out.println("");
		a.speed();
		a.display();
		System.out.println("");
		b.speed();
		b.display();
	}
}
