/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package before;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class NewClass {
	public static void main (String[] args) {
		String[] name = {"ng qi hao", "vincent", "yu kean"};
		int[] pin = {71085, 67020, 64195};
		double[] balance = {500, 200, 900};
		
		atm(name, pin, balance);
		printing(name, pin, balance);
	}
	
	public static void atm (String[] name, int[] pin, double[] balance) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String receivedName = s.nextLine();
		int found = -1;
		for (int i = 0; i < name.length; i++) {
			if (receivedName.equals(name[i])) {
				found = i;
				break;
			}
		}
		
		if (found == -1) {
			System.out.println("You have not registered!");
		} else {
			System.out.print("Enter your password: ");
			int pinEntered = Integer.parseInt(s.nextLine());
			if (pinEntered != pin[found]) {
				System.out.println("Wrong password!");
			} else {
				System.out.println(receivedName + ", your balance is RM" + balance[found]);
				System.out.print("how much you want to withdraw?");
				balance[found] = balance[found] - Double.parseDouble(s.nextLine());
				
			}
		}
	}
	
	public static void printing (String[] name, int[] pin, double[] balance) {
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "(" + pin[i] + "), you have RM" + balance[i] + "!");
		}
	}
}
