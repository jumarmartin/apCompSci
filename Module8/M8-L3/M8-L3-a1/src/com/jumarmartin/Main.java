/*
    Jumar Martin

    "wegie" of stars

    Description:
    Prints stars in descending order, from the largest string of stars per to eventually one star per for the last line.

    What I learned:
    Using nested for loops, and logic when printing stars in n-1 descending order

    Difficulties:
    At the start, line 39 (numOfStartingStars--) was within the second for loop, not the first. Had to move it up one.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Init of scanner
        Scanner s = new Scanner(System.in);
        //Init of numOfStartingStars
        int numOfStartingStars;

        //Request of iutput for the starting size of the first line of stars
        System.out.println("Enter the starting size: ");
        //Storing the user input
        numOfStartingStars = s.nextInt();

        //Init of a singular star
        String aStar = "*";

        //This for loop is for each line of stars, when the numOfStartingStars == 0, then break out of loop
        for (int i = numOfStartingStars; i >= 1;) {

            //This for loop is for each star in a line, where iN is the number of stars for that line, iN is
            //decremented once per line.
            for(int iN = numOfStartingStars; iN >= 1;){
                System.out.print(aStar);
                iN--;
            }

            System.out.println();
            //decrement number of stars
            numOfStartingStars--;
            //decrement the iterator
            i--;
        }
    }
}

/*
    Enter the starting size:
        20
        ********************
        *******************
        ******************
        *****************
        ****************
        ***************
        **************
        *************
        ************
        ***********
        **********
        *********
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *
*/
