package Week7Lecture;

public class Car {
	private String brand;
	private double cc;

	public Car(String brand, double cc) {
		this.brand = brand;
		this.cc = cc;
	}
	
	public String toString() {
		return "\nYour have a " + cc + " cc " + brand + "!";
	}
}
