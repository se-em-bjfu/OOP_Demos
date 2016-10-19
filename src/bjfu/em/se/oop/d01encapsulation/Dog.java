package bjfu.em.se.oop.d01encapsulation;

/**
 * ��������
 * @author Roy
 *
 */
public class Dog {
	private String name;
	public Dog(String name) {
		if (isBadName(name)) {
			throw new RuntimeException("������ֲ��ã�");
		}
		this.name=name;
	}
	
	public void setName(String newName) {
		if (isBadName(newName)) {
			throw new RuntimeException("������ֲ��ã�");
		}
		this.name=newName;
	}
	
	/**
	 * ���ĳ�������Ƿ��Ǻ�����
	 * @param newName
	 * @return
	 */
	private boolean isBadName(String newName) {
		if (newName.equals("XXX")) {
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}
	
	public void call() {
		System.out.println("����!");
	}
}
