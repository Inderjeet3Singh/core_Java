package suchit;

public class VarargsTest {
	
	public static void main(String[] args) {
		displayRegn("Hockey");
		displayRegn("Kho-Kho", 1,2,3);
	}

	public static void displayRegn(String nameOfSport, int... iDs){
		System.out.println("Registration for " + nameOfSport + ":");
		for(int i=0; i<iDs.length; i++) {
			System.out.println(iDs[i] + " ");
		}
	
		
	}
	

}
// o/p-----.
//Registration for Hockey:
//Registration for Kho-Kho:
//1 
//2 
//3 
