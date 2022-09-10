package _assignment.asgm3._1;

public class bankAccount {
	int accountNumber;
	int totalbalance;
	
	bankAccount (int accountNumber, int totalbalance){
		this.accountNumber = accountNumber;
		this.totalbalance = totalbalance;
		
	}
	
	void deposit() {
		System.out.println("you are in deposit");
	}
	
	void withdraw() {
		System.out.println("you are in withdraw");
	}
	
	void getbalance() {
		System.out.println("you are in getbalance");
	}

}
