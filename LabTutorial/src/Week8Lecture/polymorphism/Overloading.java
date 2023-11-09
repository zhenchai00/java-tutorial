package Week8Lecture.polymorphism;

public class Overloading {
	public static void main (String[] args) {
		
	}
	
	// Type 1
	public void method1(int x){}
	public void method1(String x){}
	
	// Type 2 
	public void method2(int x){}
	public void method2(int x, int y){}
	
	// Type 3
	public void method3(int x, String y){}
	public void method3(String x, int y){}
}
