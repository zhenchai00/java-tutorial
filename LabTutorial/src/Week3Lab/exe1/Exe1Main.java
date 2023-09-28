package Week3Lab.exe1;

public class Exe1Main {
	public static void main (String[] args) {
		Rectangle reg1 = new Rectangle(5.0, 50.0, "Yellow");
		Rectangle reg2 = new Rectangle(5.0, 50.0, "Yellow");
		
		// reg 1
		System.out.println(
				"Reg 1" + 
				"\nWidth\t:" + reg1.getWidth() +
				" cm \nHeight\t:" + reg1.getHeight() +
				" cm \nArea\t:" + reg1.findArea() + 
				" cm3 \nColor\t:" + reg1.getColor() + 
				"\n\n"
		);

		// reg 2
		System.out.println(
				"Reg 2" + 
				"\nWidth\t:" + reg2.getWidth() +
				" cm \nHeight\t:" + reg2.getHeight() +
				" cm \nArea\t:" + reg2.findArea() + 
				" cm3 \nColor\t:" + reg2.getColor() + 
				"\n\n"
		);
	}
}
