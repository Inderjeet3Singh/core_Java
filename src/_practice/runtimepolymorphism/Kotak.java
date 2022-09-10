package _practice.runtimepolymorphism;

public class Kotak extends Bank {

	Kotak(int custId, String bankName, float balance) {
		super(custId, bankName, balance);
		
	}
	void simpleInterest() {
		balance= balance *0.065f;
		System.out.println("simple interest given by Sbi is : " + balance);
	}
	
	void paid() {
		int p=80;
		balance-=p;
		System.out.println("balance deducted by Sbi is : "+ balance );
	}
	
}
