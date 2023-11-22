package Week10Lab.Demo;

public class PartTime extends Employee implements Payable {
	private double ratePerHour;

	public PartTime(double ratePerHour, String name, int hourPerWeek) {
		super(name, hourPerWeek);
		this.ratePerHour = ratePerHour;
	}
	
	public int calMonthlyWorkload () {
		return hourPerWeek * 4;
	}
	
	public double calMonthlySalary () {
		return ratePerHour * calMonthlyWorkload();
	}
	
	public String toString () {
		return super.toString() + "\nYou earn RM " + calMonthlySalary() + " this month";
	}
}
