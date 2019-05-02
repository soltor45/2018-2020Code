//********************************************************************
//  FlipRace.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the existence of separate data space in multiple
//  instantiations of a programmer-defined class.
//********************************************************************
import java.util.Scanner;
public class FlipThreeRace
{
   //-----------------------------------------------------------------
   //  Flips two coins until one of them comes up heads three times
   //  in a row.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   
   {
      int GOAL = 0;
      int count1 = 0, count2 = 0,count3 = 0;

      Scanner scan = new Scanner(System.in);
      // Create two separate coin objects
      Coin coin1 = new Coin();
      Coin coin2 = new Coin(); 
      Coin coin3 = new Coin();
      
      String User1 = "" ;
      String User2 = "" ;
      String User3 = "" ;
      
      System.out.println("What GOAL do you want");

  
while (GOAL > 5 || GOAL < 2)
        {
           System.out.println("Number is not valid");
           System.out.println("What GOAL do you want");
           GOAL = scan.nextInt(); 
        }
      scan.nextLine();
      System.out.println("What do you want your name to be for Coin 1");
      User1 = scan.nextLine();
      
      System.out.println("What do you want your name to be for Coin 2");
      User2 = scan.nextLine();
      
      System.out.println("What do you want your name to be for Coin 3");
      User3 = scan.nextLine();
      
while (count1 < GOAL && count2 < GOAL && count3 < GOAL)
      {
      
         coin1.flip();
         coin2.flip();
         coin3.flip();

         // Print the flip results (uses Coin's toString method)
         System.out.print ("Coin 1: " + coin1);
         System.out.print("  Coin 2: " + coin2);
         System.out.println ("  Coin 3: " + coin3);

         // Increment or reset the counters
         if (coin1.isHeads())
            count1++;
           else
              count1 = 0;
            
         if (coin2.isHeads())
            count2++;
           else
              count2 = 0;
            
         if (coin3.isHeads())
            count3++;
           else 
              count3=0;
      }
      
 if (count1 == GOAL)
      {
          if(count1 == count3 || count1 == count2 )
          {
              System.out.println ("TIE");
          }
          else
          {
              System.out.println (User1 + " Wins!");
          }
      }
      
if (count2 == GOAL)
      {
          if(count2 == count3 || count2 == count1 )
          {
              System.out.println ("TIE");
          }
          else
          {
              System.out.println (User2 + " Wins!");
          }
      }
       
 if (count3 == GOAL)
      {
          if(count3 == count1 || count3 == count2 )
          {
              System.out.println ("TIE");
          }
          else
          {
              System.out.println (User3 + " Wins!");
          }
      }
      
      
   }
}



   /*
    *     // Determine the winner
      if (count1 == count2 || count1== count3 || count2 == count3)// !! the tie isnt working !!
        System.out.println("Its a tie");
      else  if (count1 == GOAL)
        System.out.println(User1 + "Wins!");
      else if (count2== GOAL)
        System.out.println(User2 + "Wins!");
      else if (count3== GOAL)
        System.out.println("Coin 3 Wins!");
      else
      System.out.println("This is the pronlem");
    */
      
