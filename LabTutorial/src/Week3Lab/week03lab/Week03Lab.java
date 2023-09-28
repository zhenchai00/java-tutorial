package Week3Lab.week03lab;

import java.util.Date;

public class Week03Lab {
	public static void main(String[] args) {
		System.out.println(new Date());
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000); // to let the system sleep for 1 sec
				System.out.println(new Date());
			}
		} catch (Exception e) {
			
		}
	}	
}
