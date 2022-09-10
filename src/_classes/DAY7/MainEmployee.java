package _classes.DAY7;

public class MainEmployee {
	public static void main(String[] args) {
		Employee.changeCompany();
		Employee[] e= EmployeeManagement.addEmployee();
		EmployeeManagement.disEmployee(e) ;
		EmployeeManagement.updateEmployee(e); 
	}

}
