package _assignment.asgm3._3;

public class Employee {
	private int ssn;
	private String firstName;
	private String lastName;

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	Employee(int ssn, String firstName, String lastName) {
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;

	}
	
	void print() {
		System.out.println("ssn number :" + ssn);
		System.out.println("first name :" + firstName);
		System.out.println("last name :" + lastName);
	}
	
}
