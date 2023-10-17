package Week5Lecuture.Relationship;

public class Student {
	private String name;
	private double balance;
	private Car mycar; // Has-a relationship

	public Student(String name, double balance, Car mycar) {
		this.name = name;
		this.balance = balance;
		this.mycar = mycar;
	}
	
	public String toString(){
		return "Hello " + name + ", your have RM " + balance + "\nBesides, you have a " + mycar;
	}
}