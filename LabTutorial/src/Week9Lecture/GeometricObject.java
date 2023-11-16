package Week9Lecture;

public abstract class GeometricObject implements Drawable{
	protected double side;

	public GeometricObject(double side) {
		this.side = side;
	}
	
	public abstract double calArea ();
}
