package bjfu.em.se.oop.d06interface;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Comparable {
	private String name;
	private double salary;

	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	@Override
	public int compareTo(Object arg0) {
		if (!(arg0 instanceof Employee)) {
			throw new RuntimeException("不是一个Employee对象！");
		}
		Employee obj=(Employee)arg0;
		return -Double.compare(this.getSalary(),obj.getSalary());
	}


}


