package Week8Lecture.Inheritance;

public class NewClassC extends NewClassA {
	int c1 = 3;
	int c2 = 5;
	
	public void printC() {
		System.out.println(a1 + a2 + c1 + c2);
	}
	
	public void printA() {
		System.out.println(a1 + a2 - 10);
	}
	
	public void printB() {
		System.out.println(a1 * a2 - 10);
	}
}
