package Week9Lab.exe2;

public class GeomatricObject implements Comparable{
	protected double radius; 
	
	public GeomatricObject (double radius) {
		this.radius = radius; 
	}
	
	public double calArea () {
		return 0;
	}
	
	public String toString() {
		return "Radius: " + radius + "\t Area: " + calArea();
	}
	
	public int compareTo (Object a) {
		GeomatricObject b = (GeomatricObject)a;
		
		if (radius > b.radius) {
			return 1;
		} else if (radius < b.radius) {
			return -1;
		} else {
			return 0;
		}
	}
}
