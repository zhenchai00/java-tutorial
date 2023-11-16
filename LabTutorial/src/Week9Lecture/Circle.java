package Week9Lecture;

public class Circle extends GeometricObject{

	public Circle(double side) {
		super(side);
	}
	
	public double calArea() {
		return Math.PI * Math.pow(side, 2);
	}
	
	public void outline () {
		
	};
	
	public void color () {
		
	};
}
