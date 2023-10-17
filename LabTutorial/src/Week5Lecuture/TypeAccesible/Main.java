package Week5Lecuture.TypeAccesible;

public class Main {
	public static void main(String[] args){
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
	
		Customer customer1 = new Customer();
//		System.out.println(customer1.a); // because it was private that only can use it in the same class
		System.out.println(customer1.b);
		System.out.println(customer1.c);
		System.out.println(customer1.d);
//		System.out.println(customer1.e);
	}
}
