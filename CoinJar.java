/*
 * using the math class for the pythagorean thereom
 * you do not need an import for Math class- its part of a
 * standard java library
 */ 
import java.text.NumberFormat; // for money and percents
import java.util.Scanner;

public class CoinJar
{
    public static void main(String[] args)
    {
        Scanner scanz= new Scanner(System.in); // make scanner object 
        int xquarters, xdimes,xnickels, xpennies;
        double num1;
        final double quarters = 0.25; 
        final double dimes   = 0.10;
        final double nickels = 0.05;
        final double pennies = 0.01; 
        
        // System.out.println(f1.format(num3));
        
        System.out.println("Enter the quarters: ");
        xquarters = scanz.nextInt();
 
        System.out.println("Dimes");
        xdimes = scanz.nextInt();
        // System.out.println(f1.format(volume));
        
        System.out.println("Nickles"); 
        xnickels = scanz.nextInt();
        
        System.out.println("Pennies "); 
        xpennies = scanz.nextInt();
       
        
        NumberFormat m = NumberFormat.getCurrencyInstance();
       // System.out.println(m.format(num1));
        num1= (xpennies * pennies) + (xnickels * nickels) + (xdimes * dimes) + (xquarters * quarters);
     
        System.out.println("The value is " + (m.format(num1)));
        //NumberFormat m = NumberFormat.getCurrencyInstance();
       // make a dollar sign 
        
    }
}
