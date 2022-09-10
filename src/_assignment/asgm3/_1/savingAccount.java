package _assignment.asgm3._1;

public class savingAccount extends bankAccount{
	float interestRate;
	
	savingAccount(int accountNumber, int totalbalance, float interestRate){
		super( accountNumber,  totalbalance);
		this.interestRate= interestRate;
		
	}
	
	void addInterest() {
		System.out.println("you are in addInterest");
	}

}
