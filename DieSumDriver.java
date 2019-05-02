import java.util.Scanner;
public class DieSumDriver
{
    public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
       
      //int rollI; 
      //int rollII; 
      int roll;
      int snakeEyes = 0, num1, num2;
      int goal;

      Die1 die1 = new Die1();    
      Die1 die2 = new Die1();  
      
      System.out.println("Enter a goal between 2 and 12.");
      goal = scan.nextInt();
      
      if(goal > 12 || goal < 2)
      {
           System.out.println("Enter a goal between 2 and 12.");
           goal = scan.nextInt();
      }
      
         num1 = die1.roll();
         num2 = die2.roll();
      
      
      //rollI = die1.getFaceValue();
      //rollII = die2.getFaceValue();
      //roll = rollI + rollII;
      
      roll = num1 + num2;
      
     System.out.println("You've rolled a " + num1 + " and a " + num2);
      
      while(roll > goal || roll < goal)
      {
          
         num1 = die1.roll();
         num2 = die2.roll();
         
         roll = num1 + num2;
         
         System.out.println("You've rolled a " + num1 + " and a " + num2);

         if (num1 == 1 && num2 == 1)  // check for snake eyes
            System.out.println("You've rolled Snake Eyes");
         else if(num1 == num2 && num1 != 1)
            System.out.println("You've rolled a double");
            
      }
      
      System.out.println("You matched your goal");
      
      
      
      
     /*
      *  for (int roll = 1; roll <= ROLLS; roll++)
      {
         num1 = die1.roll();
         num2 = die2.roll();

         if (num1 == 1 && num2 == 1)  // check for snake eyes
            snakeEyes++;
      }
      
      System.out.println("Die 1: " + die1);
      System.out.println("Die 2: " + die2);
      */ 
      

    }
}