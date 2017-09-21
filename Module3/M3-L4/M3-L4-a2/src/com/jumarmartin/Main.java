/*
    Program: Sum & Average
    Version: 1.0

    Jumar Martin

    September 15th, 2017

    Compiler / Platform: Java 1.8, macOS 10.13 (High Sierra) Golden Master Build

    Description: Takes 4 variables as user input, sum them together, average them, and output the sum and average.

    Difficulties: deciding whether variSum should be a int or a double, it didn't matter which one it would be.
    If it was intialized as a double, would save on casting variSum as a double in the variAvg step.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 10;
        int y = x / 3;
        int z = x % 2;
        x++;
        System.out.println(x);
//        //Assignment step
//        Scanner sc = new Scanner(System.in);
//
//        //As the spec dictates, six variables.
//        int vari1;
//        int vari2;
//        int vari3;
//        int vari4;
//        int variSum;
//        double variAvg;
//
//
//        //User Input step
//        System.out.println("Please enter your first variable: ");
//        vari1 = sc.nextInt();
//
//        System.out.println("Please enter your second variable: ");
//        vari2 = sc.nextInt();
//
//        System.out.println("Please enter your third variable: ");
//        vari3 = sc.nextInt();
//
//        System.out.println("Please enter your final variable: ");
//        vari4 = sc.nextInt();
//
//        //Processing - summing
//        variSum = vari1 + vari2+ vari3 + vari4;
//
//        //Processing - averaging
//        variAvg =  (double) variSum / 4.0;
//
//        //Output
//        System.out.println(
//                "Thank you for entering your four numbers!  Your results are: \n\nThe sum of the four numbers is " +
//                variSum +  " and the average is " + variAvg
//        );
    }
}
