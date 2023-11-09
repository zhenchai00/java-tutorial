package Week8Lecture.polymorphism;

import Week8Lecture.Inheritance.NewClassA;
import Week8Lecture.Inheritance.NewClassC;

public class ObjectType {
	public static void main (String[] args) {
		NewClassA x1 = new NewClassA();
		NewClassC x2 = new NewClassC();
		
		// student (C) is a human (A)
		NewClassA x3 = new NewClassC();  // larger scope = small scope
		// NewClassC x4 = new NewClassA();
	}
}
