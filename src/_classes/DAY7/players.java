package _classes.DAY7;

public class players {
	String name;
	int age;
	 static String country;
	int totruns;
	
	
	players(String a, int b, int d){
		name=a;
		age=b;
		totruns=d;
		
	}
	static void staticString() {
		country="India";
		
	}
	
	void display(){
		System.out.println("-----players details----------");
		System.out.println("name of player :" + name);
		System.out.println("age of player :" + age);
		System.out.println("country of player :" + country);
		System.out.println("totruns of player :" + totruns);
		
	}
	
	
	
	
}
