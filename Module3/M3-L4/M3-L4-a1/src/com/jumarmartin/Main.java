package com.jumarmartin;

/*
    mpgProblem
    1.0

    Jumar Martin
    NCVPS (Phillip O. Berry Academy of Technology)
    September 15th, 2017

    Java 1.8, macOS 10.13 Golden Master

    Purpose:
    To calculate the average Miles Per Gallon for the vehicles that participated in the Kansas City Gran Prix
    - 1970 VW Bug
    - 1979 Firebird
    - 1980 Subaru
    - 1975 Cutlass

    Difficulties: Math.round() to round up to the tenth decimal.

    If I could revise this, I would use Arrays instead of declaring multiple doubles.

    I used the datatype double instead of int because it saved me from unnecessarily casting int types into double types
    for the rounding step.
 */

public class mpgProblem {package com.jumarmartin;

/*
    mpgProblem
    1.0

    Jumar Martin
    NCVPS (Phillip O. Berry Academy of Technology)
    September 15th, 2017

    Java 1.8, macOS 10.13 Golden Master

    Purpose:
    To calculate the average Miles Per Gallon for the vehicles that participated in the Kansas City Gran Prix
    - 1970 VW Bug
    - 1979 Firebird
    - 1980 Subaru
    - 1975 Cutlass

    Difficulties: Math.round() to round up to the tenth decimal.

    If I could revise this, I would use Arrays instead of declaring multiple doubles.

    I used the datatype double instead of int because it saved me from unnecessarily casting int types into double types
    for the rounding step.
 */

    public class mpgProblem {

        public static void main(String[] args) {
            //Assignments

            // VW Bug
            double bug1970Miles =  286;
            double bug1970Gal = 9;

            //Firebird assignments
            double firebird1979Miles = 286;
            double firebird1979Gal = 40;

            //Subaru assignments
            double subaru1980Miles = 361;
            double subaru1980Gal = 18;

            //Cutlass assignments
            double cutlass1975Miles = 161;
            double cutlass1975Gal = 11;

            //Rounding & Processing

        /*
        Using the Math.round object provided to us by the java.lang.Object class, I can round to the nearest 10th decimal.
         */

            double bugMPG = Math.round((bug1970Miles / bug1970Gal) * 10.0) / 10.0;
            double firebirdMPG = Math.round((firebird1979Miles / firebird1979Gal) * 10.0)/10.0;
            double subaruMPG = Math.round((subaru1980Miles / subaru1980Gal) * 10.0) / 10.0; //The (10.0) / 10.0 is to achieve the "nearest 10th" decimal. Without it, Math.round would round to the nearest non-decimal number.
            double cutlassMPG = Math.round((cutlass1975Miles / cutlass1975Gal) * 10.0) / 10.0;

            //Output
            System.out.println("Kansas City Grand Prix\nMiles/Per Gallon");

            System.out.println(
                    "\n1970 VW Bug averaged " + bugMPG + " m/g\n" +
                            "1979 Firebird averaged " + firebirdMPG + " m/g\n" +
                            "1980 Subaru averaged " + subaruMPG + " m/g\n" +
                            "1975 Cutlass averaged " + cutlassMPG + " m/g\n"
            );

        }
    }


    public static void main(String[] args) {
        //Assignments

        // VW Bug
        double bug1970Miles =  286;
        double bug1970Gal = 9;

        //Firebird assignments
        double firebird1979Miles = 286;
        double firebird1979Gal = 40;

        //Subaru assignments
        double subaru1980Miles = 361;
        double subaru1980Gal = 18;

        //Cutlass assignments
        double cutlass1975Miles = 161;
        double cutlass1975Gal = 11;

        //Rounding & Processing

        /*
        Using the Math.round object provided to us by the java.lang.Object class, I can round to the nearest 10th decimal.
         */

        double bugMPG = Math.round((bug1970Miles / bug1970Gal) * 10.0) / 10.0;
        double firebirdMPG = Math.round((firebird1979Miles / firebird1979Gal) * 10.0)/10.0;
        double subaruMPG = Math.round((subaru1980Miles / subaru1980Gal) * 10.0) / 10.0; //The (10.0) / 10.0 is to achieve the "nearest 10th" decimal. Without it, Math.round would round to the nearest non-decimal number.
        double cutlassMPG = Math.round((cutlass1975Miles / cutlass1975Gal) * 10.0) / 10.0;

        //Output
        System.out.println("Kansas City Grand Prix\nMiles/Per Gallon");

        System.out.println(
                "\n1970 VW Bug averaged " + bugMPG + " m/g\n" +
                "1979 Firebird averaged " + firebirdMPG + " m/g\n" +
                "1980 Subaru averaged " + subaruMPG + " m/g\n" +
                "1975 Cutlass averaged " + cutlassMPG + " m/g\n"
        );

    }
}
