package _assignment.asgm3._4.Animal;

public class Cat extends Animals {

	 Cat(String type, String locomotion){
		super(type, locomotion);
	
	}
	 @Override
	void makeSound() {
		System.out.println("Cats meows");
	}

}
