/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3Lab.staticsample;

/**
 *
 * @author GIGABYTE
 */
public class StaticSampleMain {
	public static void main (String[] args) {
		Account female = new Account(72033, 700.0, 5.5);
		Account male = new Account(72943, 300.0, 3.0);
		
		System.out.println(female.toString());
		System.out.println(male.toString());
		
		female.withdraw(150.0);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println(female.toString());
		System.out.println(male.toString());
		
		System.out.println("");
		System.out.println("");
		
		male.atmCardColor = "Red";
		
		System.out.println(female.atmCardColor);
		System.out.println(male.atmCardColor);
	}
}
