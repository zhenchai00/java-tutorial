
package Week3Lab.demo;

/**
 *
 * @author GIGABYTE
 */
public class Demo {
	public static void main (String[] args) {
		Account a = new Account();
		Account b = new Account(72943, 300.0, 3.0);
		Account c = new Account(1222, 20000.0, 0.045);
		
		System.out.println(c.toString());
		
		System.out.println("Withdraw 2500...");
		c.withdraw(2500.0);
		System.out.println(c.toString());
		
		System.out.println("Deposit 3000...");
		c.deposit(3000);
		System.out.println(c.toString());
	}
}
