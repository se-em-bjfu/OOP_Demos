package bjfu.em.se.oop.d06polymorphism3;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(name+"½Ð£ºß÷£¡");
	}
	
}
