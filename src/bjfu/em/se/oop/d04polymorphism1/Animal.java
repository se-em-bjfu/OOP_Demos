package bjfu.em.se.oop.d04polymorphism1;

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

}
