/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtutorial.Week1Lab;

import java.text.DecimalFormat;
import javax.swing.*;

/**
 *
 * @author GIGABYTE
 */
public class BMICalculator {

    public static void main(String[] args) {
        JTextField heightField = new JTextField(5);
        JTextField weightField = new JTextField(5);
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Height (cm): "));
        myPanel.add(heightField);
        myPanel.add(Box.createVerticalStrut(15));
        myPanel.add(new JLabel("Weight (KG): "));
        myPanel.add(weightField);
        int result = JOptionPane.showConfirmDialog(null, myPanel, "Please enter your height and weight", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            double heigthValue = Integer.parseInt(heightField.getText()) * 0.01;
            double weightValue = Integer.parseInt(weightField.getText());
            System.out.println("height: " + heigthValue + "m");
            System.out.println("weight: " + weightValue + "kg");
            
            DecimalFormat df = new DecimalFormat("###.##");
            double bmi;
            bmi = weightValue / (heigthValue * heigthValue);
            
            System.out.println("bmi: " + df.format(bmi));
            String bmiReference = "BMI Categories:\n" +
                                    "Underweight = <18.5\n" +
                                    "Normal weight = 18.5–24.9\n" +
                                    "Overweight = 25–29.9\n" +
                                    "Obesity = BMI of 30 or greater";
            
            JOptionPane.showMessageDialog(null, "Your BMI value is " + df.format(bmi) + "\n\n" + bmiReference);
        }

    }

}
