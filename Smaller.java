/*
 * determines the smaller of two entered numbers
 */
import java.util.Scanner;

public class Smaller
{
    public static void main (String[] args)
    {
        int num1,num2;
        Scanner scanz= new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        num1= scanz.nextInt();
        System.out.println("Enter the second");
        num2= scanz.nextInt(); 
        
        if(num1< num2)
           System.out.println("Smallest is " + num1);
        else if (num1> num2)
           System.out.println("Smalles is " + num2);
        else 
           System.out.println("The numbers are equal");
        }
        
    }