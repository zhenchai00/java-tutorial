package Week8Lecture.polymorphism;

import Week8Lecture.Inheritance.NewClassA;
import Week8Lecture.Inheritance.NewClassC;
import Week8Lecture.Inheritance.NewClassC1;
import Week8Lecture.Inheritance.NewClassD;

public class Reason {
	public static void main (String[] args) {
		NewClassA a = new NewClassA();
		NewClassC c = new NewClassC();
		NewClassC1 c1 = new NewClassC1();
		NewClassD d = new NewClassD();
		
		printing(a);
		printing(c);
		printing(c1);
		printing(d);
	}
	
	public static void printing (NewClassA x) {
		x.printA();
		x.printB();
		
		if (x instanceof NewClassC) {
			NewClassC c = (NewClassC)x;
			c.printC();
		}
		
		if (x instanceof NewClassD) {
			NewClassD d = (NewClassD)x;
			d.printD();
		}
		System.out.println();
	}
}
