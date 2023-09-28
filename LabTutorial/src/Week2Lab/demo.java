package Week2Lab;

import java.util.Scanner;

public class demo {
    public static void main (String[] args) {
	// read feet value convert to meters 
	// 1 foot = 0.305 meter
	System.out.print("Enter a positive integer value (maximum 9 digits) to convert feet to meters: ");
        Scanner s = new Scanner(System.in);
	String input = s.nextLine();
	double value = Integer.parseInt(input) * 0.305;
	
	System.out.println(input + " feets = " + value + " meters");
    }
}
