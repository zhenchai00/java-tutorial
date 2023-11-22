package Week10Lab.Exe2;

public class Circle implements GeomatricObject {
	protected double radius = 1.0;

	public Circle(double x) {
		radius = x;
	}
	
	public double getPerimeter () {
		return 2 * Math.PI * radius;
	}
	
	public double getArea () {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String toString () {
		return "\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}
