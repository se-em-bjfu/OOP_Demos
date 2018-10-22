package bjfu.em.se.oop.d06polymorphism3;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(name+"½Ð£ºÍô£¡");
	}
	
}
