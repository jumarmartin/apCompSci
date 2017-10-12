/*
    Summing Some Numbers
    Jumar Martin

    October 11th, 2017

    What I learned: How to complete do...while loops

    Description:
    The program prompts the user to add two integers, a starting value and ending value.
    Once entered, the program then prints the values (inclusive the starting and ending value) between the two user
    provided integers.
    After the program completes the printing of the inclusive values, the program then calculates the average number
    and the sum of the numbers.
    The program finally prints the results of the average and sum.

    Difficulties: How to keep track of the number of steps the do...while loop take.


    I believe that the "step" integer is extranneous.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initalization of Scanner
        Scanner s = new Scanner(System.in);

        //Initialization of starting,endingValues; the summation value, and the step counter
        int startingValue, endingValue;
        double summation = 0.0;
        int step = 0;

        //prompting user input for starting value
        System.out.println("Enter Starting Value: ");
        startingValue = s.nextInt();
        //prompting user input for ending value
        System.out.println("Enter Ending Value: ");
        endingValue = s.nextInt();

        //Initializing of the enumeratedValue, leaving the initial startingValue unchanged.
        int enumeratedValue = startingValue;

        //Do...while loop to calculate the numbers between the startingValue and endingValue.
        do{
            //Output of the current number
            System.out.println(enumeratedValue);

            //addition of the current enumerated value to the summation value.
            summation += enumeratedValue;

            //increases the enumeratedValue by one.
            enumeratedValue++;
            //Increases the step counter by one.
            step++;
        } while(enumeratedValue <= endingValue);

        //Initalization and Calculation of averageNum
        double avgNum = summation / step;

        //Output of the sum of numbers, and the average of the numbers.
        System.out.println("Sum of the numbers " + startingValue + "..." + endingValue + " is " + summation );
        System.out.println("The average of the numbers " + startingValue + "..." + endingValue + " is " + avgNum);
    }
}

/*
Sample Output:

Enter Starting Value:
5
Enter Ending Value:
8
5
6
7
8
Sum of the numbers 5...8 is 26
The average of the numbers 5...8 is 6.5

Enter Starting Value:
2
Enter Ending Value:
3
2
3
Sum of the numbers 2...3 is 5
The average of the numbers 2...3 is 2.5

Enter Starting Value:
15
Enter Ending Value:
20
15
16
17
18
19
20
Sum of the numbers 15...20 is 105
The average of the numbers 15...20 is 17.5

Enter Starting Value:
0
Enter Ending Value:
100
0
1
2
3
4
5
6
7
8
9
10
.
. (Truncated to save lines...)
.
100
Sum of the numbers 0...100 is 5050
The average of the numbers 0...100 is 50.0

Enter Starting Value:
0
Enter Ending Value:
10000

1
2
.
. (Truncated to save lines...)
.
10000
Sum of the numbers 0...10000 is 50005000
The average of the numbers 0...10000 is 5000.0
 */