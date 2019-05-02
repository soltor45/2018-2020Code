/*
 * using the math class for the pythagorean thereom
 * you do not need an import for Math class- its part of a
 * standard java library
 */ 
import java.text.NumberFormat; // for money and percents
import java.util.Scanner;

public class Ch2Prog2
{
    public static void main(String[] args)
    {
        Scanner scanz= new Scanner(System.in); // make scanner object 
        int xpounds, ounces,total_ounces;
       
        final int pounds = 16;

        System.out.println("Enter the number of pounds: ");
        xpounds = scanz.nextInt();
 
        System.out.println("Enter the number of ounces");
        ounces = scanz.nextInt();
   
        total_ounces= (xpounds * pounds) + ounces; 
        System.out.println("The total is " + total_ounces);
        
    }
}
