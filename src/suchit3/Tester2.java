package suchit3;


import java.util.Arrays;
import java.util.List;

public class Tester2 {
	public static void main(String[] args) {
		Tester2 tst =new Tester2();
		tst.addNames(Arrays.asList("Ria", "Jai", "Jack"), Arrays.asList("sam", "Tanya"));
	}
    @SafeVarargs
	private final void addNames(List<String>... names){
    	
    	for( List lst : names)
    		System.out.println(lst);
    	
    }
}


// option a