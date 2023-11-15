package Week9Lab.exe2;

public class Cylinder extends GeomatricObject{
	private double height;
	public Cylinder (double height, double radius) {
		super(radius);
		this.height = height;
	}
	
	public double calArea () {
		return Math.PI * Math.pow(radius, 2) * 2 + 2 * Math.PI * radius * height;
	}
	
	public double calVolume () {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public String toString () {
		return super.toString() + "\tVolume: " + calVolume();
	}
	
	public int compareTo (Object a) {
		Cylinder b = (Cylinder)a;
		
		if (calVolume() > b.calVolume()) {
			return 1;
		} else if (calVolume() < b.calVolume()) {
			return -1;
		} else {
			return 0;
		}
	}
}
