package Week6Lecturer.Inheritance;

import Week6Lecturer.Encapsulation.Customer;


public class CustomerPlatinum extends Customer {
	private int cashback;

	public CustomerPlatinum(int cashback, String name, int password, double balance) {
		super(name, password, balance);
		this.cashback = cashback;
	}
}
