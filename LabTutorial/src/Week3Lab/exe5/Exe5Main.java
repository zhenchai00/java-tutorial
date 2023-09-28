package Week3Lab.exe5;

import java.util.Date;

public class Exe5Main {
	public static void main (String[] args) {
		try {
			for (int i = 0; i < 5; i++) {
				Time time = new Time();
				System.out.println(time.toString());
				Thread.sleep(5000); // to let the system sleep for 5 sec;
			}
		} catch (Exception e) {
			
		}
	}
}
