package Week9Lab.exe2;

import java.util.TreeSet;

public class Main {
	public static void main (String[] args) {
		TreeSet a = new TreeSet();
		// a.add(6);
		// a.add(9);
		// a.add(5);
		// a.add(7);
		// a.add(6);
		// a.add(new Circle(9));
		// a.add(new Circle(5));
		// a.add(new Circle(7));
		
		a.add(new Cylinder(10, 7));
		a.add(new Cylinder(2, 10));
		a.add(new Cylinder(50, 3));
		System.out.println(a);
	}
}
