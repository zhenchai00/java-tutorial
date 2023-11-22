package Week10Lab.Demo;

public class Main {
	public static void main (String[] args) {
		Employee[] x = {
			new FullTime("Kervin", 3000),
			new PartTime(30 , "Andy", 5),
			new Assistant("Najwa")
		};
		printing(x);
	}
	
	public static void printing (Employee[] a) {
		for (Employee b : a) {
			System.out.println(b);
		}
	}
}
