package _javatest;

public abstract class Students {
	int sid;
	String name;
	String address;
	int age;
	String courseName;
	String collegeName;
	
	public Students(int sid, String name, String address, int age, String courseName, String collegeName) {
		
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.age = age;
		this.courseName = courseName;
		this.collegeName = collegeName;
	}
	

	abstract void findResult();

}
