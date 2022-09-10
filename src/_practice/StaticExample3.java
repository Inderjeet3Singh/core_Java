package _practice;

public class StaticExample3 {
	
public static void main(String[] args) {
	bmw c= new bmw();
    cars c2= new bmw();
  cars c1 = new cars();
        c1.car();
        c2.car();
        c.car();
        
		
		
	}
	
	

}

class bmw extends cars{
	public  void car() {
//		super.car();
		
		System.out.println("bmw has a engine");
	}
}

class cars{
	public void car() {
		System.out.println("car has a engine");
		
		
		
	}
}