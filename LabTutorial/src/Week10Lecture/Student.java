package Week10Lecture;

import java.io.Serializable;

public class Student implements Serializable{
	private String name;
	private double balance;

	public Student(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public String toString() {
		return "Hello" + name + ", you have " + balance + " balance!";
	}
}
