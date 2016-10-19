package bjfu.em.se.oop.d01encapsulation;

/**
 * 狗狗的类
 * @author Roy
 *
 */
public class Dog {
	private String name;
	public Dog(String name) {
		if (isBadName(name)) {
			throw new RuntimeException("这个名字不好！");
		}
		this.name=name;
	}
	
	public void setName(String newName) {
		if (isBadName(newName)) {
			throw new RuntimeException("这个名字不好！");
		}
		this.name=newName;
	}
	
	/**
	 * 检查某个名字是否是好名字
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
		System.out.println("汪汪!");
	}
}
