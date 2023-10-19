package week6Lecturer.Encapsulation;

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Customer c= new Customer("APU", 12345, 500);
		System.out.println(c);
		// change(c);
		changeWithPassword(c);
		System.out.println(c);
	}
	
	public static void change(Customer x){
		// x.balance = -100; // very dangerous
	}
	
	public static void changeWithPassword(Customer x){
		x.changeBalance();
	}
}
