/*
    Population Growth

    Jumar Martin

    What I learned:
    using for loops in tandem with user input, and growth rates

    Description:
    Calculates the population of a country when given the growth rate(user inputted) and show the popular for each year
    until you satisfy the user inputted years estimated.

    Difficulties:
    Getting the "The population will double the year ..." to work, it does, but it continues after....

 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //init of Scanner
        Scanner s = new Scanner(System.in);

        //Input from user on the growth rate
        System.out.println("Please enter a growth rate: ");

        //the growthRate (when inputted by user, comes in as percentage) is dvided by 100 (ex. 2.9 / 100 = .029) to be
        //used in the program, will not change
        final double growthRate = s.nextDouble() / 100;

        //Checks to see if growthRate is not 0.0, if it is, program is terminated
        if(growthRate != 0.0) {

            //This is optional... allows for more user control.
            System.out.println("Please enter the amount of years you would like to estimate: ");

            int amntYears = s.nextInt();

            //starting point (in 2010) of the country, will not change
            final int startingPop = 236;

            //initializes pop with with the startingPop
            int pop = startingPop;

            //prints out the title and data labels
            System.out.println("--------Growth Rate " + (growthRate * 100) + "% annually-------");
            System.out.println("Year \t Population (in millions)");

            //For loop to calculate the growth
            for (int i = 1; i <= amntYears; i++) {

                // calculate the new population, using the previous value
                pop = (int) ((pop * growthRate) + pop);

                //prints the year (starting year plus i) and the population for that year
                System.out.println((2010 + i) + " \t " + pop);

                //do... while loop to check when pop is less than or equal to startingPop * 2, kinda broken
                do {

                    //if...then statement to check whether pop is doubled by the initial startingPop
                    if (pop >= startingPop * 2) {
                        //prints when the population will double the initial population
                        String doubleYr = "The population will double the year " + (2010 + i);
                        System.out.println(doubleYr);
                    } else {
                        //if the pop isn't double of the startingPop, break ot of do...while loop
                        break;
                    }
                } while (pop <= startingPop * 2);
            }
        }
    }
}


/*
    Sample Output:

    Please enter a growth rate:
6.0
Please enter the amount of years you would like to estimate:
20
--------Growth Rate 6.0% annually-------
Year 	 Population (in millions)
2011 	 250
2012 	 265
2013 	 280
2014 	 296
2015 	 313
2016 	 331
2017 	 350
2018 	 371
2019 	 393
2020 	 416
2021 	 440
2022 	 466
2023 	 493
The population will double the year 2023
2024 	 522
2025 	 553
2026 	 586
2027 	 621
2028 	 658
2029 	 697
2030 	 738

Please enter a growth rate:
50
Please enter the amount of years you would like to estimate:
4
--------Growth Rate 50.0% annually-------
Year 	 Population (in millions)
2011 	 354
2012 	 531
The population will double the year 2012
2013 	 796
2014 	 1194

--------Growth Rate 25.0% annually-------
Year 	 Population (in millions)
2011 	 295
2012 	 368
2013 	 460
2014 	 575
The population will double the year 2014
2015 	 718
2016 	 897
 */

