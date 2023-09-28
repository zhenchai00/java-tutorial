package Week3Lab.exe2;

import java.util.Scanner;

public class exe2Main {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter Speed: ");
//		int speed = Integer.parseInt(s.nextLine());
		
		// v1 check speed here might not good enough as 
		// there have many laptop applied here we need to 
		// change it to many laptop
		
		Fan fan = new Fan(Velocity.valueOf(s.nextLine()), true, 1.5, "Black");
		System.out.print(fan.toString());
	}
}
