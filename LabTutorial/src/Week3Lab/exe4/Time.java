package Week3Lab.exe4;

import java.util.Date;

public class Time {
	private Date date;
	
	public Time () {
		this.date = new Date();
	}
	
	public Date getDate () {
		return this.date;
	}

	public int getHour() {
		return this.date.getHours();
	}

	public int getMinute() {
		return this.date.getMinutes();
	}

	public int getSecond() {
		return this.date.getSeconds();
	}
}
