package setter_Getter;

public class Sclass {
	
	int empno;

	@Override
	public String toString() {
		return "Sclass [empno=" + empno + ", dept=" + dept + ", salary=" + salary + "]";
	}
	String dept;
	float salary;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
