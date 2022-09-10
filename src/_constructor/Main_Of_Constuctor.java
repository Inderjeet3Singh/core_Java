package _constructor;

public class Main_Of_Constuctor {
	public static void main(String[] args) {
	// for default
	DefaultConstructor d= new DefaultConstructor();
	d.display();
	
	//for no argumnet
	No_Argument n=new No_Argument();
	n.display();
	
	// for parameterised
	Parameterised p = new Parameterised(26,"singh",.025f,'a');
	p.display();
	
	
	}
}
