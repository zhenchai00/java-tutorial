/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1Lecture;

/**
 *
 * @author GIGABYTE
 */
public class DataType {
    public static void main (String[] args) {
        
        // variable = value -> same data type
        int a1 = 7;
        int a2 = a1;
        
        String b1 = "test";
        
        // primitive type:
        // byte (8 bit) / short (16 bit) / int (32 bit) / long (64 bit)
        // float (32 bit) / double (64 bit) / char (unicode) / boolean
        
        // byte -> 256 (-128 to -1 & 0 to 127)
        
        // byte b2 = -128;
        long b3 = 10;
        int b4 = 10;
        // int b5 = 10L; // L stand for 64 bit
        // int b6 = 10l; // l stand for 64 bit
        
        // float c1 = 9.0; // this is mistake 
        double c2 = 9.9; // decimal point value must use "double" data type
        float c3 = 9.9F; // F stand for 32 bit
        float c4 = 9.9f;
        double c5 = 9.9F;
        
        // char unicode 16 bits -> ascii
        int d1 = 'H';
        char d2 = 'H';
        System.out.println(d1);
        System.out.println(d2);
        
        int d3 = 84;
        char d4 = 84;
        System.out.println(d3);
        System.out.println(d4);
        
        int d5 = 3;
        char d6 = '3';
        System.out.println(d5);
        System.out.println(d6);
    }
}
