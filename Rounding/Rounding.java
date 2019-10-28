/*
     To round a double to the nearest positive integer, add .5
     or subtract .5 if the value is negative)
     and THEN cast to an int.
*/


import java.util.Scanner;

public class Rounding
{
    private static final double PI = 3.14159; //can also use Math.PI

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double radius, volume;

        System.out.print("Enter the radius.");
        System.out.println("  Give it a decimal."); // test 3.5
        radius = s.nextDouble();

   
        volume = calcVolume(radius);
        System.out.println("Rounded " + volume + " is "  + roundIt(volume));




        System.out.println("\nDid you know that on plant Gobbledygook"
                        + " a radius can be negative? ");

        System.out.print("\nEnter your NEGATIVE radius.");
        System.out.println("  Give it a decimal."); // test -2.8
        radius = s.nextDouble();
        
        volume = calcVolume(radius);
        int roundedVol = roundIt(volume);
        System.out.println("Rounded " + volume + " is "  + roundIt(volume));

    

    }

    public static double calcVolume(double r)
    {
        double volume;
        volume = (4.0/3)* PI * Math.pow(r,3);
        return volume;
    }


    public static int roundIt(double x)
    {
        int roundedValue;
        if (x >=0)
            roundedValue = (int)(x + .5);
        else
            roundedValue = (int)(x - .5);
        return roundedValue;
    }
}
