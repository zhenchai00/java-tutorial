package Week11Lab;

import java.io.File;
import java.util.Scanner;

public class Exe1 {
	public static void main(String[] args) {
		// 12	756		3039
		try {
			Scanner s = new Scanner(new File("lab9e1.txt"));
			int l = 0, w = 0, c = 0;
			while (s.hasNext()) {
				String a = s.nextLine();
				l++;
				
				Scanner s1 = new Scanner(a);
				while (s1.hasNext()) {
					String b = s1.next();
					w++;
					c = c + b.length();
				}
			}
			System.out.println(l + "\n" + w + "\n" + c);
		} catch (Exception e) {
			System.out.print("Error .....");
		}
	}	
}
