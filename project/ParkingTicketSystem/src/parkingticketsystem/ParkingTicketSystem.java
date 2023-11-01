package parkingticketsystem;

public class ParkingTicketSystem {
	public static Page1 first;
	public static Page2 second;
	public static Page3 third;
	public static Customer loginUser = null;
	public static void main(String[] args) {
		// read data from txt file to memory
		DataIO.read();
		first = new Page1();
		second = new Page2();
		third = new Page3();
	}
}
