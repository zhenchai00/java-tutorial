package Week7Lecture;

public class Account {
	private int number;
	private double balance;

	public Account(int number, double balance) {
		this.number = number;
		this.balance = balance;
	}
	
	public String toString() {
		return "\nYour account number is " + number + " and yout have RM " + balance + "!";
	}
}
