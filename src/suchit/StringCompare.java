package suchit;

public class StringCompare {
	public static void main(String[] args) {
      String first = "String";
      StringBuilder second= new StringBuilder("String");
      
     System.out.println(first.contains(second));
     
     System.out.println(second.equals(first));
     System.out.println(first.equals(second));
	}

}
