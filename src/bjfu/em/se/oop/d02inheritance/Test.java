package bjfu.em.se.oop.d02inheritance;

public class Test {

	public static void main(String[] args) {
		Dog dog=new Dog("Íú²Æ");
		dog.run();
		dog.cry();		
		dance(dog);		

	}
	
	public static void dance(Animal ani) {
		ani.run();
		ani.cry();
		ani.cry();
		ani.run();
	}

}
