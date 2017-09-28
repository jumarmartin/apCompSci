/*
    Number Manipulation
    Ver. 1

    Jumar Martin

    Sept. 27th 2017

    Java 1.8 / macOS 10.13 (High Sierra) Golden Master

    What I Learned: how to use BigIntegers...

    Description: Mimicking doing arithmetic by hand, execute multiple calculations on the user's "most disliked number"
    within the range (and including) 1 - 9.

    Difficulties: Switching over to use bigIntegers, I had no way of printing "999999999000" (in the test case,
    888888888000)
 */

package com.jumarmartin;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initialization of Scanner to receive user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number you dislike between 1 - 9");

        //Receiving string due to usage of BigInteger
        String numberDislikeString = sc.nextLine();

        //declaration of DislikedNumber, note the usage of String "numberDislikeString" inside of BigInteger
        BigInteger DislikedNumber = new BigInteger(numberDislikeString);

        //constant value of nine
        final int constantNine = 9;

        //Multiplication
        BigInteger multiplyBy9 = DislikedNumber.multiply(BigInteger.valueOf(constantNine));

        //print out of first multiplication problem
        System.out.println(
                 "                                      " + DislikedNumber + "\n" +
                 "                                     X9" + "\n" +
                 "                              ---------" + "\n" +
                 "                                     " + multiplyBy9
        );

        //declaration of "multiplyByCrazyNumber" a.k.a. 12345679 multiplied by the output of "multiplyBy9"
        BigInteger multiplyByCrazyNumber;

        //constant value of 12345679
        final int constantBigNum = 12345679;

        // Multiplication
        multiplyByCrazyNumber = multiplyBy9.multiply(BigInteger.valueOf(constantBigNum));

        //print of second problem
        System.out.println(
                  "                              x12345679\n" +
                  "                              ---------" + "\n" +
                  "Surprise                      " + multiplyByCrazyNumber
        );

        // declaration of "multiplyByEvenCrazierNumber"
        BigInteger multiplyByEvenCrazierNumber;

        //constant value of 1000
        final int constantThousand = 1000;

        //Multiplication
        multiplyByEvenCrazierNumber = multiplyByCrazyNumber.multiply(BigInteger.valueOf(constantThousand));

        //print of the third and final problem
        System.out.println(
                "                                  X1000\n" +
                "                              ---------" + "\n" +
                "\"No Surprise\"?             " + multiplyByEvenCrazierNumber


        );
    }
}

/*
    Sample Output

    INPUT: 8

    OUTPUT:
                                      8
                                     X9
                              ---------
                                     72
                              x12345679
                              ---------
Surprise                      888888888
                                  X1000
                              ---------
"No Surprise"?             888888888000
 */