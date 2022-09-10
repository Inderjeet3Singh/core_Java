package _assignment.asgm3._2;

public class TestPerson {
	
	public static void main(String[] args) {
		Teacher t= new Teacher("Anu", 32);
		PermanentEmployee p= new PermanentEmployee("Baba",42);
		ContractEmployee c= new ContractEmployee("Vicky", 35);
		
		
		t.myProfession();
		p.myProfession();
		c.myProfession();
		
	}

}
