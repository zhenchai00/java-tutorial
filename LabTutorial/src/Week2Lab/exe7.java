package Week2Lab;

import java.util.Scanner;

public class exe7 {
	public static void main (String[] args) {
		System.out.print("Enter your result: ");
        Scanner s = new Scanner(System.in);
        double input = s.nextInt();
		String answer = null;
		
		if (input > 100 || input < 0) {
			answer = "Enter valid marks 0 - 100";
		} else if (input >= 80) {
			answer = "Your score is A+";
		} else if (input >= 75 && input <= 79) {
			answer = "Your score is A";
		} else if (input >= 70 && input <= 74) {
			answer = "Your score is B+";
		} else if (input >= 65 && input <= 69) {
			answer = "Your score is B";
		} else if (input >= 55 && input <= 64) {
			answer = "Your score is C";
		} else if (input >= 50 && input <= 54) {
			answer = "Your score is D";
		} else if (input >= 40 && input <= 49) {
			answer = "Your score is F+";
		} else if (input < 40) {
			answer = "Your score is F";
		}
		System.out.println(answer);
	}
}
