package _assignment.asgm2;

public class empobject {
	
		 public static void main(String[] args) {
			 
			 Emp e1 = new Emp();
			 System.out.println("enter details of first employee");
			e1.readEmpData();
			 Emp e2= new Emp();
			 System.out.println("enter details of Second employee");
			 e1.readEmpData();
			 
			 System.out.println("Details of 1st employee"+ "\n");
			 e1.displayEmpData();
			 System.out.println("Details of 2nd employee"+ "\n");
			 e2.displayEmpData();
		 }
		 
		 
	 

}
