/*
    small factorials
    October 11th, 2017

    Jumar Martin

    What I learned: how to use for loops and do-loops

    Description: Prompts user to enter a number to "factorialize"
    Output the factorial
    Ask the user whether or not the user wants to enter another number to factorialize

    Difficulties: Using only a for and do...while loop together.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Init of scanner
        Scanner s = new Scanner(System.in);

        //Init of variables
        int userNum;
        int step = 0;
        boolean a = false;

        //start of for loop, i is never incremented so for loop continues until break
        for(int i=1; i<=1; i++){
            //while the boolean value "a" is false
            while(a == false){

                //prompt user to enter number
                System.out.println("Enter a number: ");

                //store number in userNum variable
                userNum = s.nextInt();

                //to preserve userNum variable, sum is used in do...while loop.
                int sum = userNum;

                //do...while loop.
                do {
                    sum += sum * step;
                    step++;
                }
                while(step < userNum - 1);

                //output of sum
                System.out.println(sum);


                //prompt if the user would like to continue to find factorials
                System.out.println("Would you still like to continue to find factorials (Yes/No)");

                //store resposne (yes/no) as string
                String input = s.next();

                //reset step counter
                step = 0;

                //if the response is equal to no, break for loop.
                if(input.equals("No")){
                    break;
                }
            }

        }
    }
}