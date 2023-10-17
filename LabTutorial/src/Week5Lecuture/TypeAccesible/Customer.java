package Week5Lecuture.TypeAccesible;

public class Customer {
	// member variable
	private int a;			// Access by the same class only
	int b;					// Access by the same package 
	protected int c;		// Access by the same packages & subclasses in other packages
	public int d;			// Access by any class and packages
	
	public void printing(){
		int e = 1; // local variable
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public void printingDetails(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
//		System.out.println(e);
	}
}
