package Week9Lab.DemoAccount;

// default will be extend object
public class Account {
	private int number;
	protected double balance;
	private double annualInterestRate;
	
	// Default constructor is removed when we declare the constructor 
	 public Account() {}
	
	public Account (int number, double balance, double annualInterestRate) {
		// super();  // the super will be the first statement when declare the constructor
		this.number = number;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public String toString () {
		return "Hello " + number + ", you have RM" + balance + "!";
	}
	
	public void deposit(double amt) {
		balance = balance + amt;
	}
	
	public void withdrawal(double amt) {
		if (amt > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance = balance - amt;
		}
	}
}
