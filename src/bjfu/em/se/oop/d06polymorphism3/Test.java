package bjfu.em.se.oop.d06polymorphism3;

public class Test {

	public static void main(String[] args) {
		Animal ani=new Dog("����");
		
		ani.dance();
		
		System.out.println("----------");
		Animal ani2=new Cat("��ķ");
		ani2.dance();
	}

}
