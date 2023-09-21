package labtutorial.Week2Lab;

import java.util.Scanner;

public class exe9 {
	public static void main (String[] args) {
		int year = 10;
		double fee = 10000;
		for (int i = 0;	i < year; i++) {
			fee = (fee * 105) / 100;
			System.out.println("Fee is " + fee);
		}
	}
}
