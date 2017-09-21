/*
    Jumar Martin
    NCVPS (Phillip O. Berry AoT)
    September 20th, 2017

    Java 1.8, macOS 10.13 Golden Master

    Purpose:
    To calculate the roots of an equation using the quadratic formula.

    Difficulties:
    Writing the negative and positive roots.
 */


package com.jumarmartin;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        //Assigned "scanner" to the Scanner method(?)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter A, B, C [all on one line");

        //Assigned the three integers for input in order of A, B, C
        int aInt = scanner.nextInt();
        int bInt = scanner.nextInt();
        int cInt = scanner.nextInt();

        //Calculating the roots NOTE: negative / positive in this context does not refer to the end result.
        double negativeRoot = (-bInt - sqrt(pow(bInt, 2) - (4 * aInt * cInt))) / (2 * aInt);
        double positiveRoot = (-bInt + sqrt(pow(bInt, 2) - (4 * aInt * cInt))) / (2 * aInt);

        //Output
        System.out.println("The roots are: " + negativeRoot + ", " + positiveRoot);

    }
}
