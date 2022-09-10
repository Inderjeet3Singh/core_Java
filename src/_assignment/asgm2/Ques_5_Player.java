package _assignment.asgm2;

public class Ques_5_Player {
	String name;
	int age;
	String country;
	int totruns;

	public void display() {
		
		if (totruns > 5000) {
			System.out.println(
					"Name of player : " + name+"\n"+
					"Age of player: " + age+"\n"+
					"Country Name of player :" + country+"\n"+
					"Total runs of player :" + totruns+"\n" +
					"=================================================================");
		}

	}

	public static void main(String[] args) {
		Ques_5_Player p1 = new Ques_5_Player();
		p1.name = "Abhi";
		p1.age = 23;
		p1.country = "India";
		p1.totruns = 2000;

		Ques_5_Player p2 = new Ques_5_Player();
		p2.name = "John";
		p2.age = 34;
		p2.country = "England";
		p2.totruns = 4000;

		Ques_5_Player p3 = new Ques_5_Player();
		p3.name = "Lara";
		p3.age = 36;
		p3.country = "West Indies";
		p3.totruns = 8000;

		Ques_5_Player p4 = new Ques_5_Player();
		p4.name = "Sachin";
		p4.age = 31;
		p4.country = "India";
		p4.totruns = 6450;

		Ques_5_Player p5 = new Ques_5_Player();
		p5.name = "Amla";
		p5.age = 32;
		p5.country = "South Africa";
		p5.totruns = 4500;
		
		System.out.println("Player Details who score more than 5000 runs - ");
		
		p1.display();

		p2.display();

		p3.display();

		p4.display();

		p5.display();

		

	}
	
		
	
}
