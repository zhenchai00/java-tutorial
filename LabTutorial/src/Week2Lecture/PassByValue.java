package Week2Lecture;
public class PassByValue {
	public static void main (String[] args) {
		int x =7;
		System.out.println("1 " + x);
		PassByValue obj = new PassByValue();
		int returnValue = obj.change(x);
		System.out.println("4 " + x + "  " + returnValue);
	}
	
	public int change (int a) {
		System.out.println("2 " + a);
		a = 11;
		System.out.println("3 " + a);
		return 11;
	}
}
