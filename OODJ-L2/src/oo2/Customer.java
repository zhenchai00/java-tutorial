
package oo2;

public class Customer {
	String name;
	int pin;
	double balance;
	
	// Constructor
	// 1) Must same name as the class name to become constructor
	// 2) no return type
	// 3) cannot be explicity called = cannot be called
	public Customer(String x, int y, double z) {
		name = x;
		pin = y;
		balance = z;
	}
	
	public void withdrawal (double amount) {
		balance = balance - amount;
	}
}
