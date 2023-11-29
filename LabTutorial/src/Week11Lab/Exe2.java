package Week11Lab;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exe2 {
	public static void main (String[] args) {
//		String x = "I LOVE APU!";
//		String y = "I LOVE APU!";
		String x = "I L*O@V#E A$P%U&!";
		String y = "I L*O@V#E A$P%U&!";
		Scanner a = new Scanner(x);
		StringTokenizer b = new StringTokenizer(y, "*@$%&#");
		
		while (a.hasNext()) {
			System.out.println(a.next() + "\n");
		}
		System.out.println();
		System.out.println();
		
		while (b.hasMoreTokens()) {
			System.out.println(b.nextToken() + "\n");
		}
		System.out.println();
		System.out.println();
	}
}
