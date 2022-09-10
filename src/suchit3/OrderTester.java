package suchit3;

import java.io.Closeable;
import java.io.IOException;

public class OrderTester extends Invoice implements Cloneable {
	int bill =301;

	public static void main(String[] args) throws CloneNotSupportedException{
		 OrderTester r1 = new OrderTester();
		 
		 OrderTester r2 = (OrderTester) r1.clone();
		 r1.id=100;
		 r1.no =200;
		 r1.bill =300;
		 
		 System.out.println(r2.id + " " +r2.no + " " + r2.bill);
		 
		 
	}

	
}


class Order {
	int id =101;
	
}

class Invoice extends Order {
	int no= 201;
}

// o/p---> 101 201 301