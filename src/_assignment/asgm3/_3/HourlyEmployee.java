package _assignment.asgm3._3;

public class HourlyEmployee extends Employee{
	
	float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	HourlyEmployee(int ssn, String firstName, String lastName,float salary) {
		super(ssn, firstName, lastName);
		this.salary=salary;
		
		
	}
	
	void computeGrossPay() {
		float pay= 8*22*salary;
		System.out.println("gross salry of hourly employee :"+ pay);
		
	}
	
	void computeNetPay() {
		float pf=8*22*salary*.04f;
		System.out.println("net pay of hourly emoployee :"+(8*22*salary*0.96f));
		
	}
	@Override
	void print() {
		
		System.out.println("Hourly employee");
		super.print();
		System.out.println("Hourly rate of employee :" + salary);
		System.out.println("total hours in a day : 8");
		System.out.println("total working day in a month : 22");
		System.out.println("provident fund deduction  :" + 8*22*salary*.04f);
		
		
		
	}

}
