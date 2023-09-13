/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtutorial.Week1Lab;

import javax.swing.JOptionPane;

/**
 *
 * @author GIGABYTE
 */
public class DialogSample {
    public static void main (String[] arg) {
        String input = JOptionPane.showInputDialog("Enter your birth year: ");
        int year = Integer.parseInt(input);
        int age = 2023 - year;
        JOptionPane.showMessageDialog(null, "Your age is " + age + "years old");
    }
    
}
