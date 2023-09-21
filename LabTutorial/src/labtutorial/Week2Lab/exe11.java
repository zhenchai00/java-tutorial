package labtutorial.Week2Lab;

import java.util.Scanner;

public class exe11 {
	public static void main (String[] args) {
        System.out.print("Enter your investing amount: ");
        Scanner s = new Scanner(System.in);
        double investmentAmount = Integer.parseInt(s.nextLine());
        System.out.print("Enter your interest rate: ");
        double interestRate = Integer.parseInt(s.nextLine());
        System.out.print("Enter your investment duration (years): ");
        double duration = Integer.parseInt(s.nextLine());
//        double futureInvestmentVal = (investmentAmount * (1 + interestRate)) / (duration * 12);
		double futureInvestmentVal = Math.pow((investmentAmount * (1 + interestRate)), (duration * 12));
        System.out.println("Your future investment value is " + futureInvestmentVal);
//		System.out.println(1 + interestRate);
//		System.out.println(investmentAmount * (1 + interestRate));
//		System.out.println(duration *12);
//		System.out.println(500/12);
//		System.out.println(futureInvestmentVal);
		
    }
}
