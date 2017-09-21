package com.jumarmartin;

/*
Jumar Martin
September 13, 2017
NCVPS (Phillip O. Berry Academy of Technology)

Have to help out the peers...
 */

public class Main {

    public static void main(String[] args) {
       /*
math equations obtained from:
        http://mathworld.wolfram.com/SampleVariance.html
        */
// define some ages
        int momsAge = 42;
        int dadsAge = 43;
        int myAge= 22, sistersAge= 16;
        int dogsAge= 6;

// get the mean

        double ageSum = (momsAge + dadsAge + myAge + sistersAge + dogsAge);
        double average = ageSum / 5;

               // calculate the sample variance
        double variance= 0.0;
        variance += (momsAge - average)*(momsAge - average);
        variance += (dadsAge - average)*(dadsAge - average);
        variance += (myAge - average)*(myAge - average);
        variance += (sistersAge - average)*(sistersAge - average);
        variance += (dogsAge - average)*(dogsAge - average);
        variance = variance / 4;

// get the std. dev
        double standardDev= Math.sqrt(variance);
// output the results
        System.out.println("The sample age mean is: " + average);
        System.out.println("The sample age variance is: " + variance);
        System.out.println("The sample age standard deviation is: " + standardDev);

    }
}