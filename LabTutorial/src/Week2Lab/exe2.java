package Week2Lab;

import java.util.Scanner;

public class exe2 {
	public static void main (String[] args) {
		System.out.print("Enter radius of a cylinder (cm): ");
        Scanner s = new Scanner(System.in);
        double radius = Integer.parseInt(s.nextLine());
		double area = Math.PI * radius * radius;
		System.out.print("Enter height of a cylinder (cm): ");
		double height = Integer.parseInt(s.nextLine());
		double volume = height * area;
				
		System.out.println("The volume of cylinder is " + volume + "cm3");
	}
}
