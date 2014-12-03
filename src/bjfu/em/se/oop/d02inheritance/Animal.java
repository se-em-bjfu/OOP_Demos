package bjfu.em.se.oop.d02inheritance;

public class Animal {
	protected String name;
	public Animal(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"Εά");
	}
	
	public void cry() {
		System.out.println(name+"½Π");
	}

}
