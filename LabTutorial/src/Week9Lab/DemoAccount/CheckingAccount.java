package Week9Lab.DemoAccount;

public class CheckingAccount extends Account {
	private double overdraftLimit;

	public CheckingAccount(double overdraftLimit, int number, double balance, double annualInterestRate) {
		super(number, balance, annualInterestRate);
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdrawal (double amt) {
		if (amt > (balance + overdraftLimit)) {
			System.out.println("Exceed Overdraft Limit");
		} else if (amt > balance) {
			overdraftLimit = overdraftLimit - (amt - balance);
			balance = 0;
		} else {
			balance = balance - amt;
		}
	}
	
	public String toString () {
		return super.toString() + " \nBesides, you have RM" + overdraftLimit + " in your overdraft limit!";
	}
}
