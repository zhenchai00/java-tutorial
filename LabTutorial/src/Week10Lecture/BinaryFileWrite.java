package Week10Lecture;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BinaryFileWrite {
	public static void main (String[] args) {
		Student[] x = {
			new Student("APU", 123),
			new Student("APIIT", 321),
			new Student("KL", 3223)
		};
		
		try {
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("data.txt"));
			a.writeObject(x);
			a.close();
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();  // print the standard error
		}
	}
}
