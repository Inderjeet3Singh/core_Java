package suchit;

import java.util.HashMap;
import java.util.Map;

public class MapImp1 {
	
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
	    map.put(new Person("jack"), "sendSalesReport");
	    map.put(new Person("jack"), "sendAuditReport");
	    map.put(new Person("mady"), "sendInventoryReport");
	    
	    System.out.println(map.size());
	}

}

class Person{
	
	String name;
	Person (String name){
		this.name= name;
	}
	
	public boolean equals(Object ob) {
		return ((Person)ob).name==this.name;
	}
	
	public int hashCode() {
		return name.length();
	}
	
}
 // o/p---> output will be 2
          //if the hashcode method is commented output will be 3