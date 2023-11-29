package Week11Lab;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			int[] x = new int[10];

			PrintWriter p = new PrintWriter("demo.txt");

			for (int a : x) {
				a = (int)(Math.random() * 100);
				System.out.println(a);
				p.println(a);
			}
			p.close();
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter File name: ");
			String file = s.nextLine();
			s = new Scanner(new File(file));
			
			while (s.hasNext()) {
				System.out.println(s.nextLine());
			}
			
		} catch (Exception e) {
			System.out.println("error ......");
		}
	}	
}
