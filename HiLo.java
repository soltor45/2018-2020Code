import java.util.Scanner;
import java.util.Random;
public class HiLo
{
 public static void main (String[] args)
 {
     int mine,number, guess;
     number = 0;
     Scanner scan = new Scanner(System.in);
     Random generator= new Random ();
     
     mine= generator.nextInt(100) + 1;
     System.out.println("I generated " + mine);
 
     System.out.println("Guess the number");
     guess = scan.nextInt();
     
 while(guess != mine)// in wrong range
   {
      if (guess < 0 || guess > 100) 
      { System.out.println("Invalid Number.");     
       System.out.println("Guess the number"); // will force them to go until they do it right
        guess = scan.nextInt();
      }
     else if  (guess > mine)
      { System.out.println("Your guess is too high");
       System.out.println("Guess the number");
        number ++;
       System.out.println("You've guessed " + number + " times");
        guess = scan.nextInt();
      }
     else if (guess < mine)
     { System.out.println("Your guess is too low");
      System.out.println("Guess the number");
        number ++;
      System.out.println("You've guessed " + number + " times");
       guess = scan.nextInt(); 
     }  
    }
   
  if (guess == mine)
{ System.out.println("Your guess is correct!!");
  System.out.println("You guessed " + number + " times incorrectly before you got it right");  
}
}   
  

}    
 

