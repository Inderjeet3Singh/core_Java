package suchit;

public class Student extends Personn{
   public Student() { //line 8
	  
	   System.out.println("Student");
	   
   }
   
  public static void main(String[] args) { //line 11
	new Personn("Bob");
}
}

class Personn{
	public Personn(String name) {
		System.out.println(name);
	}
}
 // o/p---> error at line 8
// must use super