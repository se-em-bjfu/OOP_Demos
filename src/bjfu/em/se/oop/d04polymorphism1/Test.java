package bjfu.em.se.oop.d04polymorphism1;

public class Test {

	public static void main(String[] args) {
		Animal ani=new Dog("Íú²Æ");
		//ani.run();
		//ani.cry();
		
		dance(new Dog("Ð¡±¦"));
		
		System.out.println("----------");
		Animal ani2=new Cat("ÌÀÄ·");
		//ani2.run();
		//ani2.cry();
		dance(new Cat("¼Ó·Æ"));
	}
	
	public static void dance(Animal ani) {
		ani.run();
		ani.cry();
		ani.cry();
		ani.run();
	}

}
