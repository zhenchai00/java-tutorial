package Week3Lab.exe2;

public class Fan {
//	private int speed; // cannot use it any more
	private Velocity speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan(Velocity speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	
	public String toString(){
		return "\nSpeed\t: " + this.speed + "\nPower\t: " + this.on + "\nRadius\t: " + this.radius + "\nColor\t: " + this.color ;
	}
}
