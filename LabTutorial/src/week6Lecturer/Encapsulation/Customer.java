package week6Lecturer.Encapsulation;

import java.util.Scanner;

public class Customer {
	private String name;
	private int password;
	private double balance;

	public void changeBalance() {
		// Hide the implementation 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your password: ");
		int password = Integer.parseInt(s.nextLine());
		
		if (password != this.password) {
			System.out.print("Hacker! Leave me alone!\n");
		} else {
			System.out.print("Enter your new balance: ");
			this.balance  = Integer.parseInt(s.nextLine());
		}
	}
	
	public Customer(String name, int password, double balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	public String toString(){
		return this.name +", You have RM" + this.balance;
	}
}
