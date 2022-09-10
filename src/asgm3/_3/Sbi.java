package asgm3._3;

public class Sbi extends Bank{

	Sbi(int custId, String bankName, float balance) {
		super(custId, bankName, balance);
		
	}
	
	void simpleInterest() {
		float bal= balance *0.07f;
		System.out.println("simple interest given by Sbi is : " + bal);
	}
	
	void paid() {
		int p=40;
		balance-=p;
		System.out.println("bank charges for enquiry :" +p);
		System.out.println("balance remaining : "+ balance );
	}
	
	

}
