package com.jumarmartin;

public class Main {

    public static void main(String[] args) {
        final double pi = 3.14159;
        double lakeRadius = .95;
        double islandDiameter = 4.16;
        double islandRadius = islandDiameter / 2;

        double lakeArea = pi * (lakeRadius * lakeRadius);
        double islandArea = pi * (islandRadius * islandRadius);

        double usableLand = (int) ((islandArea - lakeArea) * 100) / 100.00 ;

        System.out.println("Double island with a diameter of " + islandDiameter  + " miles that contain a circular lake " +
                "of " + (lakeRadius * 2) +  " miles has " + usableLand + " square miles of cultivatable land.");
    }
}
