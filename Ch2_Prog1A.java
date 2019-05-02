/*
 * using the math class for the pythagorean thereom
 * you do not need an import for Math class- its part of a
 * standard java library
 */
import java.text.DecimalFormat;// this lets you decide how many numbers it is 
import java.util.Scanner;

public class Ch2_Prog1A
{
    public static void main(String[] args)
    {
        Scanner scanz= new Scanner(System.in); // make scanner object
      
        double radius,volume,height;  
        final double pi = 3.14159; 
        
        // this limits it to 4 points !
        // System.out.println(f1.format(num3));
        
        System.out.println("Enter a radius: ");
        radius = scanz.nextDouble();
 
        System.out.println("Enter a height: ");
        height= scanz.nextDouble();
        
        DecimalFormat f1 = new DecimalFormat("0.000");
        volume= Math.pow(radius,2) * pi * height;
       
        System.out.println("Volume: ");
        System.out.println(f1.format(volume));
    

    
    }
}
