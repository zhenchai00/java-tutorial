package Week3Lab.exe3;

import java.util.GregorianCalendar;

public class Exe3Main {
	public static void main (String[] args) {
		GregorianCalendar calender = new GregorianCalendar();
		
		int year = calender.get(GregorianCalendar.YEAR);
		int month = calender.get(GregorianCalendar.MONTH);
		int day = calender.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("Current Year: " + year);
        System.out.println("Current Month: " + month);
        System.out.println("Current Day: " + day);
	}
}
