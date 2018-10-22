package bjfu.em.se.oop.d07interface;

public class Manager extends Employee
{
	private double bonus;

	public Manager(String n, double s)
	{
		super(n, s);
		bonus = 0;
	}

	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b)
	{
		bonus = b;
	}

}
