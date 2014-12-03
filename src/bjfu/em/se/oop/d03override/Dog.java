package bjfu.em.se.oop.d03override;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(name+"½Ð£ºÍô£¡");
	}
	
}
