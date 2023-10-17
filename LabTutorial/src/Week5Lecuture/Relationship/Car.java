package Week5Lecuture.Relationship;

public class Car {
	private String brand;
	private String color;
	private double cc; 

	public Car(String brand, String color, double cc) {
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	public String toString(){
		return brand + " car in " + color + " color and cc " + cc + "!";
	}
}
