
/*
 * uses a constant for pi and calculates the area of a circle
 */

import java.util.Scanner;
public class Constants
{
    public static void main (String [] args)
    {
        Scanner scanboi= new Scanner(System.in); // Make scanner object
     
        // make a constant
        final double PI = 3.14159;
        
        double radius,area;
        
        System.out.println("Enter the radius: ");
        radius = scanboi.nextDouble();
        
        area = PI * radius * radius;
        
        System.out.println("The area is " + area);
       
    }
}