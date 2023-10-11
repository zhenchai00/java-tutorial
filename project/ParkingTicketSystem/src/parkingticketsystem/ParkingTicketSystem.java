package parkingticketsystem;

public class ParkingTicketSystem {
	public static Page1 first;
	public static void main(String[] args) {
		// read data from txt file to memory
		DataIO.read();
		first = new Page1();
	}
}
