package _assignment.asgm3._3;

public class LibManagement {
	
	public static void main(String[] args) {
		
		
		
		Author author=new Author("baba", "baba@gmail.com", 'M');
//	    author.setEmail("vicky@gmail.com");
		
		
		
		Book b= new Book("Java", author, 1000.0, 5);
		
	
		
		System.out.println(b.toString());
		
		
	}
	

}

