package _assignment.asgm3._4.Animal;

public class Animals {
	String type;
	String locomotion;
	
   public Animals(String type, String locomotion ){
    	this.type=type;
    	this.locomotion=locomotion;
    	
    }
	
    void makeSound() {
    	System.out.println("make different sounds");
    }
    
    void display() {
    	
    	System.out.println("type :" +type);
    	System.out.println("locomotion :" +locomotion);
    }

}
