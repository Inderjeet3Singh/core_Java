package _practice.runtimepolymorphism;

public class Axis extends Bank{

	Axis(int custId, String bankName, float balance) {
		super(custId, bankName, balance);
		
	}
	void simpleInterest() {
		balance= balance *0.06f;
		System.out.println("simple interest given by axis is : " + balance);
	}
	
	void paid() {
		int p=50;
		balance-=p;
		System.out.println("balance deducted by axis is : "+ balance );
	}

}
