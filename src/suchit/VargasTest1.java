package suchit;

public class VargasTest1 {
	public static void main(String[] args) {
		new VargasTest1().display(5, "infosys");
		new VargasTest1().display(5, "infosys", "limited");
		
	}
   
	public void display(int b, String... strings ) {
		System.out.println(strings[strings.length-1] +" ");
		
	}
}

// o/p----> infosys limited 
