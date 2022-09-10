package _assignment.asgm3._1;

public class checkingAccount extends bankAccount {
	int fee;
	
	checkingAccount(int accountNumber, int totalbalance, int fee){
		super( accountNumber,  totalbalance);
		this.fee = fee;
	}
	
	void deductfee() {
		System.out.println("you are in deductfee");
		
	}

}
