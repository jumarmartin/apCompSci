/*
    CompSci Power and Light
    Version 1

    Jumar Martin

    Sept 27th, 2017

    What I learned: Formatting properly

    Description: Calculates electric bill given kwhRate, surcharge, and city Tax rates.

    Difficulties: keeping up with the different charges and where to put them.
 */

package com.jumarmartin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialization of Scanner
        Scanner sc = new Scanner(System.in);

        //Request of user's KW/H usage (by the nearest hour)
        System.out.println("Enter Kilowatt per Hour (nearest hour) used: ");
        int hoursUsed = sc.nextInt();

        //constant KW/H rate
        final double kwhRate = 0.0475;

        //calculation of base charge
        final double baseCharge = Math.round((kwhRate * hoursUsed) * 100.0) / 100.0;

        //calcualtion of surcharge
        final double surcharge = Math.round((baseCharge * 0.03) * 100.0) / 100.0;

        //calculation of the tax from the city
        final double taxCity = Math.round((baseCharge * .1) * 100.0) / 100.0;

        //calculation of final amount to pay
        double amntPay = baseCharge + surcharge + taxCity;

        //calculation of late pay if applicable
        double latePay = Math.round(((amntPay * 0.04) + amntPay) * 100.0) / 100.0;

        //output
        System.out.println(

                "C O M P S C I Electric \n" +
                "-------------------------\n" +
                "Kilowatts Used   " + hoursUsed + " @ $ " + kwhRate + "\n" +
                "-------------------------\n" +
                "Base Charge      $ " + baseCharge + "\n" +
                "Surcharge      $ " + surcharge + "\n" +
                "City Tax      $ " + taxCity + "\n" +
                "               ----" + "\n" +
                "Pay this amount $ " + amntPay + "\n" +
                "After September 30th Pay $ " + latePay
        );
    }
}

/*
    Sample:

    INPUT:

    993

     OUTPUT:

C O M P S C I Electric
-------------------------
Kilowatts Used   993 @ $ 0.0475
-------------------------
Base Charge      $ 47.17
Surcharge      $ 1.42
City Tax      $ 4.72
               ----
Pay this amount $ 53.31
After September 30th Pay $ 55.44

 */