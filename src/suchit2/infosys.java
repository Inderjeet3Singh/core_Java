package suchit2;

import java.util.concurrent.Executors;

public class infosys {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2= new Object();
		
		var service = Executors.newFixedThreadPool(3);
		var future1 = service.submit(() -> {
			synchronized (obj1) {
				synchronized (obj2) {
					System.out.print("Hi");
					
				}
			}
		});
		
		var future2= service.submit(()  -> {
			synchronized (obj2) {
				synchronized (obj1) {
					System.out.print("Bye");
					
				}
			}
			
		});
		
		future1.get();
		future2.get();
	}

}
