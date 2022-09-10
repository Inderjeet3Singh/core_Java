package suchit;

public class Bikes extends Vehicle{
	
	Bikes(){
		super();
		System.out.println("Bike is created");
	}
   
	
	public static void main(String[] args) {
		Bikes b = new Bikes();
	}
}


class Vehicle{
	
	Vehicle(){
		System.out.println("Vehicle is created");
	}
	
}

// o/p---> vehicle is created  bike is created