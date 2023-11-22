package Week10Lab.Demo;

public class Assistant extends Employee {
	public Assistant(String name) {
		super(name, 2);
	}
	
	public int calMonthlyWorkload () {
		return 8;
	}
}
