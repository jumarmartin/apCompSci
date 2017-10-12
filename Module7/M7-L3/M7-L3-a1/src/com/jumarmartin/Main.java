/*
    finding sum and average

    Jumar Martin

    October 11th, 2017

    What I learned: grabbing input from files

    Description: THe program takes input from a local file, prints the scores from that file, sums the scores,
    display the number of scores, and takes the average of all the scores put together.

    Difficulties:

    Having the program read the file on my desktop...
 */

package com.jumarmartin;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //Init of scanner and file.
        Scanner s = new Scanner(new File("/Users/Jumars-Mac/Desktop/ini.dat"));
        s.nextInt();
        //Init of variables used
        int maxIndx = -1;
        int numbers[] = new int[100];
        int sum = 0;
        double step = 0;

        //Output of Scores
        System.out.println("Scores: ");

        //While loop to loop over output.
        while(s.hasNext()) {
            //Index to assign everything to an array
            maxIndx++;

            //THe array takes in the numbers from the file
            numbers[maxIndx] = s.nextInt();

            //prints the array
            System.out.println(numbers[maxIndx]);
            //finds the sum
            sum += maxIndx;

            //Incriments the step counter until all values are accounted for.
            step++;
        }
        //output of the sum of all the numbers
        System.out.println("The sum of the numbers = " + sum);
        //The number of scores are equal to the step.
        System.out.println("The number of scores = " + step);

        //finding the average
        double avgNum = sum / step;
        //final output of the average
        System.out.println("The average of the numbers = " + avgNum);
        //close of file
        s.close();
    }
}
