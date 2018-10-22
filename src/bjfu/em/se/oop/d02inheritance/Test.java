package bjfu.em.se.oop.d02inheritance;

public class Test {

	public static void main(String[] args) {
		Dog dog=new Dog("Íú²Æ");
		dog.run();
		dog.cry();	

		
		System.out.println("--------------");
		dance(dog);	
		
		System.out.println("--------------");		
	    Animal ani=new Dog("Íú²Æ2");
	    ani.run();
	    ani.cry();
	    


	}
	
	public static void dance(Animal ani) {
		ani.run();
		ani.cry();
		ani.cry();
		ani.run();
	}

}
