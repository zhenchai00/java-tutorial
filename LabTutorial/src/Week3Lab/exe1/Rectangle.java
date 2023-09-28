package Week3Lab.exe1;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle() {
		
	}
	
	public Rectangle (double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double findArea () {
		return this.width * this.height;
	}
	
	public double findPerimeter () {
		return (this.width * 2) + (this.height * 2);
	}
}
