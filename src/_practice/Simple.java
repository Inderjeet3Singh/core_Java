package _practice;

public class Simple {

	public static void main(String[] args) {

		Pokemon p = new Pokemon();

		//p.name = "Rakesh";

		//System.out.println(p.name);

	//	Pokemon p2 = new Pokemon("HI");

		//System.out.println(p2.name);

		Pokemon p3 = new Pokemon();
		
		p3.setName("ki");
		System.out.println(p3.getName());

		
		PokemonGo p4 = new PokemonGo();
		p4.setName("PP");
		
		Pokemon pp=new Pokemon("A","B","C");
		
		
		
	}

}

class Pokemon {

	private String name, name2, name3;

	

	public Pokemon(String name, String name2, String name3) {

		this.name = name;
		this.name2 = name2;
		this.name3 = name3;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public Pokemon() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class PokemonGo extends Pokemon{
	private String totalRun;
	
	
}









