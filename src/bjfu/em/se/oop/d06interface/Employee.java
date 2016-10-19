package bjfu.em.se.oop.d06interface;

public class Employee implements Comparable<Employee> {
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
	public int compareTo(Employee e) {
		return -Double.compare(this.getSalary(),e.getSalary());
	}


}


