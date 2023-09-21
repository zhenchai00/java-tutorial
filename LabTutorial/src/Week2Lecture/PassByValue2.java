package Week2Lecture;
public class PassByValue2 {
	public static void main (String[] args) {
		int[] x = {5, 6, 7, 8, 9};
		System.out.println("aaa " + x.getClass().getSimpleName());
		System.out.println("1 " + x[2]);
		change(x);
		System.out.println("4 " + x[2] + "  ");
		System.out.println("aaa " + x.getClass().getSimpleName());
	}
	
	public static void change (int[] a) {
		System.out.println("2 " + a[2]);
		a[2] = 11;
		System.out.println("3 " + a[2]);
	}
}
