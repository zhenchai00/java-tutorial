package Week2Lab;

import java.util.Scanner;

public class exe4 {
	public static void main (String[] args) {
		System.out.print("Enter character to convert uppercase to lowercase: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
						
		System.out.println("Lowercase of \"" + input + "\" is " + input.toLowerCase());
	}
}
