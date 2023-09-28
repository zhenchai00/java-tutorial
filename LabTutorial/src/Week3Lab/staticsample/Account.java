/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Lab.staticsample;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author GIGABYTE
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;

	static String atmCardColor = "Gold";
	
	public Account () {
	}

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate () {
		return this.annualInterestRate/12;
	}
	
	public void withdraw (double amount) {
		this.balance = this.balance - amount;
	}
	
	public void deposit (double amount) {
		this.balance = this.balance + amount;
	}
	
	public String toString () {
		DecimalFormat decimalFormat = new DecimalFormat("#0.00");
		decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
		
		return this.id + ", you have RM" + decimalFormat.format(this.balance) 
				+ "\nBeside, your monthly interest is RM" + decimalFormat.format(this.balance * this.getMonthlyInterestRate()) + ".";
	}
}
