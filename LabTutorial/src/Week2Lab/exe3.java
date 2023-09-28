package Week2Lab;

import java.util.Scanner;

public class exe3 {
    public static void main (String[] args) {
        System.out.print("Enter a positive integer value (maximum 9 digits): ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int value = Integer.parseInt(input);
        int answer = 0;
        while (value > 0) {
            answer = answer + (value % 10);
            value = value / 10;
        }
        System.out.println(answer);
    }
}