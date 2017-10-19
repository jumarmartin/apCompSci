/*
    Jumar Martin

    Minimum Wage

    Description:
    Calculator for Total wages for numOfWorkers at 10,20,30, and 40 hours a week per worker.

    What I Learned:
    Proper loop control when working with multiple lines and the same numOfWorkers++, also using numOfWorkers as an
    indexer

    Difficulties:
    Whether to use hardcoded values as the amount of hours (10, 20, 30, 40) or write a small formula to do so. Opted for
    the former.

 */

package com.jumarmartin;

public class Main {

    public static void main(String[] args) {
        int numOfWorkers;
        final int hourlyRate = 8;

        for(numOfWorkers = 3; numOfWorkers <= 7; numOfWorkers++) {
            System.out.println("Wages for " + numOfWorkers + " employees");
            System.out.println("For 10 hours worked, the wages are " + ((10 * hourlyRate) * numOfWorkers) + " dollars");
            System.out.println("For 20 hours worked, the wages are " + ((20 * hourlyRate) * numOfWorkers) + " dollars");
            System.out.println("For 30 hours worked, the wages are " + ((30 * hourlyRate) * numOfWorkers) + " dollars");
            System.out.println("For 40 hours worked, the wages are " + ((40 * hourlyRate) * numOfWorkers) + " dollars\n");
        }
    }
}

/*

Sample Output:

Wages for 3 employees
For 10 hours worked, the wages are 240 dollars
For 20 hours worked, the wages are 480 dollars
For 30 hours worked, the wages are 720 dollars
For 40 hours worked, the wages are 960 dollars

Wages for 4 employees
For 10 hours worked, the wages are 320 dollars
For 20 hours worked, the wages are 640 dollars
For 30 hours worked, the wages are 960 dollars
For 40 hours worked, the wages are 1280 dollars

... followed by the rest of the expected output
 */