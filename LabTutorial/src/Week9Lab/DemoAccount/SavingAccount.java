package Week9Lab.DemoAccount;

public class SavingAccount extends Account {
	// default constructor
	// public SavingAccount () {
	//		super(); // means will call the superclass constructor
	// }
	
	// priavte 
	public SavingAccount (int x, double y, double z) {
		super(x, y, z); // need super() to help to initialize constructor from parent class 
		// number = x;
		// balance = y;
		// annualInterestRate = z; 
	}
}
