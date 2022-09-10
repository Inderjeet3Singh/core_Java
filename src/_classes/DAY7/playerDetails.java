package _classes.DAY7;

import java.util.Scanner;

public class playerDetails {

	static players[] playersDetails() {
		System.out.println("enter name, age & total runs");
		players[] p = new players[2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {
			p[i] = new players(sc.next(), sc.nextInt(), sc.nextInt());
			System.out.println("enter next players details");

		}
		return p;
	}

	static void displayPlayers(players[] p) {
		for (int i = 0; i < 2; i++) {
			p[i].display();
		}

	}
}
