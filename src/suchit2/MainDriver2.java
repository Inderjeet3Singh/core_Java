package suchit2;

public class MainDriver2 {
	public static void main(String[] args) {
		
		//Five five= new Four().new Five();
		//Four.Five five1= new Five();
		//Five five3= new Five();
		
	
	Four.Five four=new Four().new Five();
		
	}

}


class Four{
	public class Five{
		public void doPrint() {
			System.out.println("InnerClass");
		}
	}
}

// a is correct