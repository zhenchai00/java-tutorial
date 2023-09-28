package Week2Lab;

import java.util.Scanner;

public class exe10 {
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String input = null;
		
		do {
			System.out.println("Continue (No to stop)? ");
			input = s.nextLine();
		} while (! input.equals("No"));
	}
}
