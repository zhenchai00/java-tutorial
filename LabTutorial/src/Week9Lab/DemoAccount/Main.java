package Week9Lab.DemoAccount;

public class Main {
	public static void main (String[] args) {
		SavingAccount sa1 = new SavingAccount(72943, 800, 1.2);
		System.out.println(sa1);
		System.out.println("Withdraw RM 500......");
		sa1.withdrawal(500);
		System.out.println(sa1);
		System.out.println("Withdraw RM 1000......");
		sa1.withdrawal(1000);
		System.out.println(sa1);
		
		System.out.println();
		
		CheckingAccount ca1 = new CheckingAccount(2000, 11111, 6000, 0.1);
		System.out.println(ca1);
		System.out.println("Withdraw RM 500......");
		ca1.withdrawal(500);
		System.out.println(ca1);
		System.out.println("Withdraw RM 5000......");
		ca1.withdrawal(6000);
		System.out.println(ca1);
		System.out.println("Withdraw RM 1000......");
		ca1.withdrawal(1000);
		System.out.println(ca1);
	}
}
