/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1Lab;
import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class BirthYear {
    public static void main (String[] args) {
        System.out.print("Enter your birth year: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int year = Integer.parseInt(input);
        int age = 2023 - year;
        System.out.println("Your age is " + age + " year's old");
        
    }
}
