package parkingticketsystem;

public class Ticket {
	private int number, time, charge;
	private Customer owner;

	public Ticket(int number, int time, int charge, Customer owner) {
		this.number = number;
		this.time = time;
		this.charge = charge;
		this.owner = owner;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

	public void setOwner(Customer owner) {
		this.owner = owner;
	}

	public int getNumber() {
		return number;
	}

	public int getTime() {
		return time;
	}

	public int getCharge() {
		return charge;
	}

	public Customer getOwner() {
		return owner;
	}
	
}
