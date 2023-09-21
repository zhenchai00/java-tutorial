package labtutorial.Week2Lab;

import java.util.Scanner;

public class exe5 {
	public static void main (String[] args) {
		System.out.print("Enter character to convert ascii code to character: ");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
		char value = (char) input;
						
		System.out.println("Character is " + value);
	}
}
