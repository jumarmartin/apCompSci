/*
    Jumar Martin
    October 4th, 2017

    Hourly Pay

    A program that creates a chart showing the amount earned at $4.00 per hour up to 40 hours.

    What I learned:
    Using the iterator apart of the whole program

    difficulties:

    Formatting the output

 */

package com.jumarmartin;

public class Main {

    public static void main(String[] args) {

        //Constant pay ($4)
        final int payPerHour = 4;

        //Init of For loop
        for(int hour = 1; hour <= 40; hour++ ) {
            //Heading for each "Hour Pay" pair
            System.out.println("Hours  " + " Pay");
            //outputs the pay (4) per hour
            // to determine the hour, using the iterator.
            System.out.println(" " + hour + "       " + (payPerHour * hour) + "\n");
        }
    }
}

/*
Sample Output (to hour = 10)

Hours   Pay
 1       4

Hours   Pay
 2       8

Hours   Pay
 3       12

Hours   Pay
 4       16

Hours   Pay
 5       20

Hours   Pay
 6       24

Hours   Pay
 7       28

Hours   Pay
 8       32

Hours   Pay
 9       36

Hours   Pay
 10       40


 */