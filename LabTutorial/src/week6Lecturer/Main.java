package Week6Lecturer;

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
		x.balance = -100; // very dangerous
	}
	
	public static void changeWithPassword(Customer x){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your password: ");
		int password = Integer.parseInt(s.nextLine());
		
		if (password != x.password) {
			System.out.print("Hacker! Leave me alone!\n");
		} else {
			System.out.print("Enter your new balance: ");
			x.balance  = Integer.parseInt(s.nextLine());
		}
	}
}
