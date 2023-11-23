package Week10Lecture;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class BinaryFileRead {

	public static void main(String[] args) {
		try {
			ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.txt"));
			Student[] s = (Student[]) a.readObject();
			a.close();
			for (Student x : s) {
				System.out.println(x);
			}
		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();  // print the standard error
		}
	}
	
}
