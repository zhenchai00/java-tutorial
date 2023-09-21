package oo2;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Customer[] data = {		// data[0] / data[1] / data[2]
			new Customer("ng qi hao", 71085, 500),
			new Customer("vincent", 67012, 500),
			new Customer("yu kean", 64195, 500),
		};
		
		printing(data);
		atm(data);
	}
	
	public static void atm (Customer[] data) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String receivedName = s.nextLine();
		Customer found = null;
		for (Customer data1 : data) {
			if (receivedName.equals(data1.name)) {
				found = data1;
				break;
			}
		}
		
		if (found == null) {
			System.out.println("You have not registered!");
		} else {
			System.out.print("Enter your password: ");
			int pinEntered = Integer.parseInt(s.nextLine());
			if (pinEntered != found.pin) {
				System.out.println("Wrong password!");
			} else {
				System.out.println(receivedName + ", your balance is RM" + found.balance);
				System.out.print("how much you want to withdraw? ");
//				found.balance = found.balance - Double.parseDouble(s.nextLine());
                found.withdrawal(Double.parseDouble(s.nextLine()));
				
			}
		}
		printing(data);
	}
	
	public static void printing (Customer[] customerData) {
		for (Customer data: customerData) {
			System.out.println(data.name + "(" + data.pin + "), you have RM" + data.balance + "!");
		}
	}
}
