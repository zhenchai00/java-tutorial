package Week9Lab.exe2;

public class Circle extends GeomatricObject {
	public Circle (double radius) {
		super(radius);
	}
	
	public double calArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
