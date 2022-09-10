package fileHandling;

import java.io.IOException;

public class ForExample5 {
	public static void main(String[] args) throws IOException {
		Student s1= new Student("vicky","cs", 26,98);
		Student s2= new Student("baba","cs", 27,88);
		Student s3= new Student("robert","cs", 25,98);
		
	
		
	}

}

class Student{
	String name;
	String sub;
	int age;
	int marks;
	
	
	public Student(String name, String sub, int age, int marks) {
	
		this.name = name;
		this.sub = sub;
		this.age = age;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", sub=" + sub + ", age=" + age + ", marks=" + marks + "]";
	}


}
