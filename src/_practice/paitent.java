package _practice;

public class paitent extends hospital {
	String name;
	int age;
	String add;
	int num;
	paitent(String name, int age, String add, int num) {
		super();
		this.name = name;
		this.age = age;
		this.add = add;
		this.num = num;
	}
	
	paitent(){
		
	}
	
	void display() {
		super.show();
		System.out.println("name :" + name);
		System.out.println("age :" + age);
		System.out.println("address :" + add);
		System.out.println("mobile number :" + num);

	}

}
