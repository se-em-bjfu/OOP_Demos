package bjfu.em.se.oop.d06polymorphism3;

public class Animal {
	protected String name;
	public Animal(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"ÅÜ");
	}
	
	public void cry() {
		System.out.println(name+"½Ğ");
	}
	
	public void dance() {
		System.out.println(name+"ÔÚÌøÎè:");
		run();
		cry();
		cry();
		cry();
		run();
	}

}
