package bjfu.em.se.oop.d01encapsulation;

public class People {
	public void walk() {
		moveLeftFoot();
		moveRightFoot();
	}

	public void moveRightFoot() {
		System.out.println("���ҽ�");
		
	}

	private void moveLeftFoot() {
		System.out.println("�����");
	}

}
