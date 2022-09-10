package suchit;

import java.util.ArrayList;
import java.util.List;

public class ListImp2 {
	public static void main(String[] args) {
		List<String> a1= new ArrayList<String>();
		
		a1.add("infosys");
		a1.add("google");
		a1.add("ibm");
		a1.add("amazon");
		
		for(int i=0; i<a1.size(); i++) {
			a1.remove(i);
			
			if(a1.get(i++).equals("google")){
				a1.add("oracle");
				
			}
		}
		System.out.println(a1);
		
	}

}

// o/p---> [google, ibm, oracle]
