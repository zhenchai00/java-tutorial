package labtutorial.Week2Lab;

import java.util.Scanner;

public class exe6 {
	public static void main (String[] args) {
		System.out.print("Enter months to get days: ");
        Scanner s = new Scanner(System.in);
        int month = s.nextInt();
		String response = null;
		
		if (month > 12 || month < 0) {
			response = "Please enter valid month";
		}
		
		
		switch (month) {
			case 1: 
				response = "January is 31 Days";
				break;
			case 2: 
				response = "February is 28 Days";
				break;
			case 3: 
				response = "March is 31 Days";
				break;
			case 4: 
				response = "April is 30 Days";
				break;
			case 5: 
				response = "May is 31 Days";
				break;
			case 6: 
				response = "June is 30 Days";
				break;
			case 7: 
				response = "July is 31 Days";
				break;
			case 8: 
				response = "August is 31 Days";
				break;
			case 9: 
				response = "September is 30 Days";
				break;
			case 10: 
				response = "October is 31 Days";
				break;
			case 11: 
				response = "November is 30 Days";
				break;
			case 12: 
				response = "December is 31 Days";
				break;
		}
		System.out.println(response);
	}
}
