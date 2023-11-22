package Week10Lab.Demo;

public class FullTime extends Employee implements Payable {
	private double salary;
	public FullTime(String name, double salary) {
		super(name, 40);
		this.salary = salary;
	}
	
	public int calMonthlyWorkload () {
		return hourPerWeek * 4;
	}
	
	public double calMonthlySalary () {
		return salary;
	}
	
	public String toString () {
		return super.toString() + "\nYou earn RM " + calMonthlySalary() + " this month";
	}
}
