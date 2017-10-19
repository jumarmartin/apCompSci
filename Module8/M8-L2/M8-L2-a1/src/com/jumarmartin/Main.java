/*
    Jumar Martin

    Decimal Equivalents

    What I learned:
    Using For and do...while loops together

    Description:
    Prints a table of decimal equivalents of all proper fractions with denominators 2...14, inclusive. Rounded up to the
    5th decimal place

    Difficulties:
    Formatting, definitely.

 */

package com.jumarmartin;

public class Main {

    public static void main(String[] args) {
        int numerator = 1;
        int denominator = 2;

        for (int i = 0; i < 14; i++) {
            do {
                if (numerator < denominator) {
                    System.out.println(numerator + "/" + denominator + " \t" + Math.round(( (double) (numerator) / denominator) * 100000.0) / 100000.0);
                    numerator++;
                } else {
                    numerator = 1;
                    denominator++;
                    i++;
                }
            } while(denominator <= 14);
        }
    }
}

/*
    Sample Output:
3/7					0.42857
4/7					0.57143
5/7					0.71429
6/7					0.85714
1/8					0.125
2/8					0.25
3/8					0.375
4/8					0.5
5/8					0.625
6/8					0.75
7/8					0.875
1/9					0.11111
2/9					0.22222
3/9					0.33333
4/9					0.44444
5/9					0.55556
6/9					0.66667
7/9					0.77778
8/9					0.88889
 */