package _assignment.asgm3._3;



public class TestEmployee {
	public static void main(String[] args) {
		
		
		HourlyEmployee h = new HourlyEmployee(1001,"Pradeep","Maurya",350f);	
		SalariedEmployee s= new SalariedEmployee(1002,"Inder","Singh",60000f);
		
		h.print();
		h.computeGrossPay();
		h.computeNetPay();
		
		System.out.println("---------------------");
		s.print();
		s.computeGrossPay();
		s.computeNetPay();
	
	}

	

}
