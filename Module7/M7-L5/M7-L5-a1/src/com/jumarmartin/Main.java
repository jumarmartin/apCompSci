/*
    Formatted Numbers

    Jumar Martin
    October 13th, 2017

    What I learned:
    Nested for loops!

    Description:
    Prints out the numbers (inclusive) 1 - 25, 5 integers to a line.

    Difficulties:
    Understanding the logic behind using two for loops together to generate the list, took many trials, and many errors.

 */

package com.jumarmartin;

public class Main {

    public static void main(String[] args) {

        /*
            init of first for loop
            i (increment) is declared and assigned
            when i is less than or equal to 25, continue to run
            increment i by 5
            when i is greater than 25, break; end program.
         */

        System.out.println("Formatting Numbers 1 - 25");
        for(int i = 1; i <= 25; i += 5) {
            /*
                init of second for loop
                num (number) is declared and assigned
                when num is less than (i + 5) continue to run
                increment num by one each pass
             */
            for(int num = i ; num < i + 5; num++ ) {
                //Print out num and insert a tab (\t)
                System.out.print(num + "\t");
            }
            //Insert a new line
            System.out.println();
        }
    }
}
