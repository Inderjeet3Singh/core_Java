package _assignment.asgm3._4.Animal;

import java.util.Scanner;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("enter animal name");
		Scanner sc = new Scanner(System.in);
		String animalName = sc.next();

		Animals a = constructAnimalObject(animalName);
		
		if (a != null) {
			
			a.display();
			a.makeSound();
			System.out.println("Reff     :   "+a.toString());
			
		} else {
			System.out.println("Class Not define");
		}

	}

	private static Animals constructAnimalObject(String animalName) {

		if (animalName.equals("Dog")) {
			return new Dog("mammals", "walk");

		} else if (animalName.equals("Cat")) {
			return new Cat("mammals", "walk");

		} else {

			return null;
		}
	}

}
