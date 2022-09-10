package _practice.runtimepolymorphism;

public class Bank {
	int custId;
	String bankName;
	float balance;
	
	Bank(int custId, String bankName, float balance){
		this.custId= custId;
		this.bankName= bankName;
		this.balance= balance;
	}
	
	void display(){
		System.out.println("cust id :"+ custId);
		System.out.println("bank name :"+ bankName);
		System.out.println("balance :"+ balance);
		
	}
	
	void simpleInterest() {
		balance= balance *0.05f;
		System.out.println("simple interest is : " + balance);
	}
	
	void paid() {
		System.out.println("balance paid is : 2000");
	}

}
