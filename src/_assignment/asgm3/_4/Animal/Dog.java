package _assignment.asgm3._4.Animal;

public class Dog extends Animals {

	Dog(String type, String locomotion) {
		super(type, locomotion);
	}

	@Override
	void makeSound() {
		System.out.println("Dogs barks");
	}

}
