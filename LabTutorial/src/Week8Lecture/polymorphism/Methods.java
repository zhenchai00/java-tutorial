package Week8Lecture.polymorphism;

import Week8Lecture.Inheritance.NewClassA;
import Week8Lecture.Inheritance.NewClassC;
import Week8Lecture.Inheritance.NewClassC1;
import Week8Lecture.Inheritance.NewClassD;

public class Methods {
	public static void main (String[] args) {
		NewClassA xa = new NewClassA();
		NewClassC xc = new NewClassC();
		
		xa.printA();
		xc.printA();
		xa.printB(); // polymorphism - Override Method
		xc.printB(); // polymorphism - Override Method
		xc.printC();
		
		// polymorphism - object type - promotion / cast up 
		NewClassA ac = new NewClassC();
		ac.printA();
		ac.printB();  // during runtime, as saving the memory address of a NewClassC object
		// ac.printC(); // during compile time, ac is a NewClassA varaiable type
		
		
		// casting / cast down
		NewClassC ca = (NewClassC)ac; // subclass = superclass -> multilevel
		ca.printC();
		
		// casting / cast down -> error 1 - compile time error
		String s = "John";
		// NewClassC ca = (NewClassC)s; // must have inheritance relationship
		
		// casting / cast down -> error 2 - runtime error
		NewClassA ac1 = new NewClassC1();
		// NewClassC caSpecial = (NewClassC)ac1; // runtime error
		// compile time check variable type and runttime check object type 
		
		// multilevel
		NewClassA ad = new NewClassD();
		NewClassD da = (NewClassD)ad;
	}
}
