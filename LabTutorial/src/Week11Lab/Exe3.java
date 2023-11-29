package Week11Lab;

import java.util.Arrays;

public class Exe3 {
	public static void main (String[] args) {
		int[] x = new int[10];

		for (int i = 0; i < x.length; i++) {
			x[i] = (int)(Math.random() * 100);
		}
		printing(x);
		Arrays.sort(x);
		printing(x);
	}
	
	public static void printing (int[] z) {
		for (int b : z) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
}
