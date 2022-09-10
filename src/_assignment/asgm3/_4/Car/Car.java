package _assignment.asgm3._4.Car;

public class Car {
	int model;
	String color;

	Car(int model,String color) {
		this.model =model;
		this.color=color;
		
	}
	void display() {
		System.out.println("model :"+ model);
		System.out.println("color :"+ color);
	}
	
	void speed() {
		System.out.println("speed of car");
	}

}
