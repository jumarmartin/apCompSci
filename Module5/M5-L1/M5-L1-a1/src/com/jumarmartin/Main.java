/*
    Program: Monthly Payment
    Version: 1.0

    Jumar Martin

    September 27th, 2017

    Compiler / Platform: Java 1.8, macOS 10.13 (High Sierra) Golden Master Build

    What I learned: How to use the advanced functions of the "Math" methods (class?)

    Description: Generate the facts about a loan for a particular amount to be borrowed at a specific rate and time.

    Difficulties: Implementing the monthly payment formula.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Assignment of Scanner
        Scanner sc = new Scanner(System.in);

        //Asking the user for input
        System.out.println("The amount I wish to borrow is?");
        double amntBorrow = sc.nextDouble();

        System.out.println("The loan rate I can get is? ");
        double loanRate = sc.nextDouble();

        System.out.println("The number of years it will take me to play off the loan is? ");
        int amntYears = sc.nextInt();

        //convert years to months
        int amntMonths = amntYears * 12;

        //Monthly Payments formula // algorithm
        double monthlyPayments =

                Math.round((amntBorrow * (loanRate / 1200)) *
                (

                        (Math.pow( 1 + (loanRate / 1200), amntMonths)) / (Math.pow(1 + (loanRate / 1200), amntMonths) - 1)
                ) * 100.0) / 100.0;

        //I could've also made another variable named "monthlyPaymentsRounded", then apply the "Math.round" function on
        // the output on monthlyPayments, but I digress.

        //Output of the facts found about that particular loan.
        System.out.println("My monthly payments will be $ " + monthlyPayments);

        double interestPaid = Math.round(((monthlyPayments * amntMonths) - amntBorrow) * 100.0) / 100.0;
        System.out.println("Total Interest Paid is $ " + interestPaid);

        double totalAmntPaid = Math.round((interestPaid + amntBorrow) * 100.0) / 100.0;
        System.out.println("Total Amount paid is $ " + totalAmntPaid);
    }

}

/*
    Test Case 1:

    INPUT

    borrow: $35,000
    loan rate: 20.34%
    # of years: 6


    OUTPUT

    My monthly payments will be $ 845.26
    Total Interest Paid is $ 25858.72
    Total Amount paid is $ 60858.72

    Test Case 2:

    INPUT

    borrow: $75,000
    loan rate: 10.34%
    # of years: 3

    OUTPUT

    My monthly payments will be $ 2432.03
    Total Interest Paid is $ 12553.08
    Total Amount paid is $ 87553.08
 */
