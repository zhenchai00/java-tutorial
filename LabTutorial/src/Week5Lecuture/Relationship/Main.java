package Week5Lecuture.Relationship;

public class Main {
	public static void main(String[] args){
		Car car1 = new Car("Perodua Myvi", "Green", 1.5);
		Student student1 = new Student("cz", 200000, car1);
		System.out.println(student1);
		
		Student[] allStudents = new Student[10];
		System.out.println(allStudents);
	}
}
