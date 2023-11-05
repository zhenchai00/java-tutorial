package Week7Lecture;

public class Main {
	public static void main (String[] args) {
		Hostel a1 = new Hostel(2, 201);
		Student fStd = new Student("Sam" , 57134, 400, a1);
		Car c1 = new Car("myvi", 1.5);
		fStd.setCar(c1);
		
		Hostel a2 = new Hostel(3, 301);
		Student mStd = new Student("Yosuf" , 71163, 200, a2);
		
		System.out.println(fStd);
		System.out.println(mStd);
	}
}
