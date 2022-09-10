package _assignment.asgm3._3;

public class SalariedEmployee extends Employee{
	float salary;
	
	SalariedEmployee(int ssn, String firstName, String lastName,float salary) {
		super(ssn, firstName, lastName);
		this.salary= salary;
	}

	public void setSalary(float salary) {
		this.salary=salary;
	}
	
   public float getSalary() {
	   return salary;
   }
   
   void computeGrossPay() {
	   float hra=salary*.10f;
	   float health=salary*0.4f;
	   System.out.println("Gross pay for salaried person :" +(hra+health+salary));
	   
   }
   
   void computeNetPay() {
	   float tax = salary*.05f;
	   float pf=salary*.01f;
	   System.out.println("Net pay for salried person :" +(salary-(tax+pf)));
	   
   }
   
    void print(){
	   System.out.println("salaried employee");
	   super.print();
    	
    	System.out.println("salary of person :"+ salary);
    	System.out.println("house rent allowance :"+ salary*.10f);
    	System.out.println("health benefits :"+ salary*0.4f);
    	System.out.println(" tax deducted :"+ salary*.05f);
    	System.out.println(" employee provident fund deducted :"+ salary*.01f);
    	
  
    	
	   
   }

}
