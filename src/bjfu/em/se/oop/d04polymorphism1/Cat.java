package bjfu.em.se.oop.d04polymorphism1;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(name+"½Ð£ºß÷£¡");
	}
	
}
