package setter_Getter;

public class Test {
	public static void main(String[] args) {
		Sclass s= new Sclass();
		s.setEmpno(1000);
		System.out.println(s.getEmpno());
		
		
		s.setDept("baba");
		System.out.println(s.getDept());
		
		s.setSalary(5000000f);
		System.out.println(s.getSalary());
		
		System.out.println("");
		
		System.out.println(s.toString());
	}

}
