package bjfu.em.se.oop.d04polymorphism1;

public class Test {

	public static void main(String[] args) {
		Animal ani=new Dog("����");
		//ani.run();
		//ani.cry();
		
		dance(new Dog("С��"));
		
		System.out.println("----------");
		Animal ani2=new Cat("��ķ");
		//ani2.run();
		//ani2.cry();
		dance(new Cat("�ӷ�"));
	}
	
	public static void dance(Animal ani) {
		ani.run();
		ani.cry();
		ani.cry();
		ani.run();
	}

}
