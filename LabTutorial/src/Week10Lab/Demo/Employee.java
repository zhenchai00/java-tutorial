package Week10Lab.Demo;

public abstract class Employee {
	protected String name;
	protected int hourPerWeek;

	public Employee (String name, int hourPerWeek) {
		this.name = name;
		this.hourPerWeek = hourPerWeek;
	}
	
	public abstract int calMonthlyWorkload ();
	
	public String toString () {
		return "\nHello " + name + ", you worked " + calMonthlyWorkload() + " hours this month.";
	}
}
