package bjfu.em.se.oop.d06polymorphism3;

public class Animal {
	protected String name;
	public Animal(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println(name+"��");
	}
	
	public void cry() {
		System.out.println(name+"��");
	}
	
	public void dance() {
		System.out.println(name+"������:");
		run();
		cry();
		cry();
		cry();
		run();
	}

}
