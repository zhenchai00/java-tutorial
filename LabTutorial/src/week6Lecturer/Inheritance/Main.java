package Week6Lecturer.Inheritance;

public class Main {
	public static void main (String[] args){
		CustomerVIP x = new CustomerVIP(10, "APU", 123, 100.00);
		System.out.println(x.toString());
		x.setDiscount(50);
		System.out.println(x.toString());
		
//		Customer y = new Customer("APIIT", 123, 100.00);
//		System.out.println(y.toString());
	}
}
