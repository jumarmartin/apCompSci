/*
    Identity Theft
    Version 1

    Jumar Martin

    Sept. 27th, 2017

    What I learned: Switch Cases, and how to use them effectively when you have no way else of solving the problem.

    Description: provide a checksum letter to a credit card number.

    Difficulties: Learning how to actually find out the checksum letter, when adding the numbers up and modulo
    by 26, we would be way off from the ASCII number (ex. (16 26 26 26 % 26) = 16 != 81 (Q) nor 113 (q)
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Init of Scanner
        Scanner sc = new Scanner(System.in);

        //Requesting of credit card number
        System.out.println("Enter the credit card number (XX XX XX XX): ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        int fourthNumber = sc.nextInt();

        //Generating checksum Number
        int checksumNumber = (firstNumber + secondNumber + thirdNumber + fourthNumber) % 26;
        char checksumLetter;

        //Very inelegant - Finding the checksumLetter
        switch (checksumNumber) {
            case 0: checksumLetter = 'A';
                    break;
            case 1: checksumLetter = 'B';
                break;
            case 2: checksumLetter = 'C';
                break;
            case 3: checksumLetter = 'D';
                break;
            case 4: checksumLetter = 'E';
                break;
            case 5: checksumLetter = 'F';
                break;
            case 6: checksumLetter = 'G';
                break;
            case 7: checksumLetter = 'H';
                break;
            case 8: checksumLetter = 'I';
                break;
            case 9: checksumLetter = 'J';
                break;
            case 10: checksumLetter = 'K';
                break;
            case 11: checksumLetter = 'L';
                break;
            case 12: checksumLetter = 'M';
                break;
            case 13: checksumLetter = 'N';
                break;
            case 14: checksumLetter = 'O';
                break;
            case 15: checksumLetter = 'P';
                break;
            case 16: checksumLetter = 'Q';
                break;
            case 17: checksumLetter = 'R';
                break;
            case 18: checksumLetter = 'S';
                break;
            case 19: checksumLetter = 'T';
                break;
            case 20: checksumLetter = 'U';
                break;
            case 21: checksumLetter = 'V';
                break;
            case 22: checksumLetter = 'W';
                break;
            case 23: checksumLetter = 'X';
                break;
            case 24: checksumLetter = 'Y';
                break;
            case 25: checksumLetter = 'Z';
                break;
            //If all else fails... (which it wont)
            default: checksumLetter = 'A';
        }

        //Displaying of the correct checksumLetter
        System.out.println("The correct number and code is " + firstNumber + " " + secondNumber + " " + thirdNumber +
                " " + fourthNumber + " " + checksumLetter);

    }
}

/*
    Sample Output:

    INPUT:

    26 54 74 55

    OUTPUT:

    The correct number and code is 26 54 74 55 B

 */
