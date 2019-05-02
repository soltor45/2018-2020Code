/*

 *  Demonstrates the use of logical AND operator
 */

import java.util.Scanner;

public class CanDrive
{
    public static void main (String[] args)
    {
       // step 1: declare variables
       int age,tickets;
       final int DRIVING_AGE=16;
        
       Scanner search =new Scanner(System.in);
       
        // step 2: get info from user, save to variables
        
       System.out.println("What is your age?: ");
       age = search.nextInt();
      
       System.out.println("How many tickets do you have");
       tickets = search.nextInt();
      
      // step 3: math/decision     // step 4:output 
        if(age >= 90)
           System.out.println("You must be tested again.");
         else if (age >= DRIVING_AGE && tickets > 3)
           System.out.println("Slow Down!");
         else if( age >= DRIVING_AGE && tickets <=3)
           System.out.println("Congrats on Safe Driving.");
         else 
           System.out.println("Not old enough yet." + " Wait" + (DRIVING_AGE - age) + "years");
        
        
        }
        
    }
    
       