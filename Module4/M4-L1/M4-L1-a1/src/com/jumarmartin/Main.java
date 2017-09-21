/*
    circleProblem
    1.0

    Jumar Martin
    NCVPS (Phillip O. Berry AoT)
    September 20th, 2017

    Java 1.8, macOS 10.13 Golden Master

    Purpose:
    To calculate and print the radius, area, and circumference of a circle.

    Difficulties:
    Not using Math.round(), and using a much more gritty method.

    If I could revise this, I would simply use Math.round().
 */

package com.jumarmartin;

public class Main {

    public static void main(String[] args) {
        //Constant Pi, pi never changes!
        final double pi = 3.14159;
        //the rest are not constant! except maybe area since it's only calculating and does not contain any variables?
        double radius = 20;
        double area = pi * (radius * radius);
        double circumference = (int) ((2 * pi * radius) * 1000) / 1000.000;

        System.out.println(
                "The Radius of the circle =" + "           " + radius + "\n" +
                "The Area of the circle =" + "           " + area + "\n" +
                "The Circumference of the circle =" + "   " + circumference
        );

    }
}
