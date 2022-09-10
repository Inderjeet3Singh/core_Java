package suchit;

import java.util.Set;
import java.util.TreeSet;

public class SetImp2 {
	
	public static void main(String[] args) {
		Set<String> set =new TreeSet<String>();
		
		
		set.add("infosys");
		set.add("google");
		set.add("ibm");
	
		for (String s:set) {
		
			System.out.println(" "+ s);
     		set.clear();
     		
     		System.out.println(set);
		}
	}

}

// o/p----> runtime exception
