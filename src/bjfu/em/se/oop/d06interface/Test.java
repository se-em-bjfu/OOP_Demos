package bjfu.em.se.oop.d06interface;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Employee[] staff = new Employee[3];

		Manager boss = new Manager("Carl Cracker", 80000);
		boss.setBonus(5000);

		staff[0] = boss;
		staff[1] = new Employee("Harry Hacker", 20000);
		staff[2] = new Employee("Tommy Tester", 40000);


		Arrays.sort(staff);
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
		
	}

}
