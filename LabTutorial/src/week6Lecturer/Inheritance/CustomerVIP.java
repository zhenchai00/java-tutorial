package week6Lecturer.Inheritance;

import week6Lecturer.Encapsulation.Customer;

// techinically, logically & diagram -> correct
// JAVA does not support multiple inheritance 
public class CustomerVIP extends Customer {  // logically IS-A
	// all the attribute and methos will be inherited
	
	// but you can have new attributes 
	private int discount;
	
	// constructor will not be inherited
	public CustomerVIP(int discount, String name, int password, double balance) {
		// super means calling the superclass constructor
		super(name, password, balance);
		this.discount = discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString(){
		return super.toString() + "\n Besides, your discount rate is " + this.discount + "%!";
	}
}
