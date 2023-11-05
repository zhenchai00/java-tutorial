package Week6Lecturer;

public class Customer {
	String name;
	int password;
	double balance;
	
	public Customer(String name, int password, double balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public String toString(){
		return this.name +", You have RM" + this.balance;
	}
}
