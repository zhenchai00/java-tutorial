package Week7Lecture;

public class Hostel {
	private int block;
	private int room;

	public Hostel(int block, int room) {
		this.block = block;
		this.room = room;
	}
	
	public String toString() {
		return "\nYour room number is " + room + " in block " + block + "!";
	}
}
