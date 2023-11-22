package Week10Lab.Exe2;

public class Main {
	public static void main (String[] args) {
		ResizableCircle x = new ResizableCircle(7);
		System.out.println(x);
		x.resize(5);
		System.out.println(x);
		x.resize(-2);
		System.out.println(x);
	}
}
