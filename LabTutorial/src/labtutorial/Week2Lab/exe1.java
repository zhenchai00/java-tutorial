package labtutorial.Week2Lab;

import java.util.Scanner;

public class exe1 {
	public static void main (String[] args) {
		System.out.print("Enter a positive integer value for converting Fahrenheit degree to Celsius (maximum 9 digits): ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        double value = (Integer.parseInt(input) - 32) * 5 / 9;
		
		System.out.println(input + " Fahrenheit degree = " + value + " Celsius");
	}
}
