/*
 * this class shows using loops to make code repeat
 * for(initialize; condition;increment)
 * {
 *     stuff to repeat goes inside brackets
 *  }
 */
import java.util.Scanner;
public class ThreeForLoops
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      
      int count,pos=0;
      String word = "";
      
      System.out.println("Here's the first loop");
      
      for(count = 10; count <= 22; count ++)
      {
          System.out.print(count + " ");
      }
        
      
      System.out.println("\n\nHere's the second loop");
      for (count = 100; count  >=20; count= count-5) 
      {
          System.out.print(count + " ");
      }
        
      System.out.println("\n\nWrite a word or phrase");
      word = scan.nextLine();
        // first positioin is position 0, (not for length, just position)
                                    //positions also include spaces and punctuation

      
      pos = word.charAt(pos);
      for (pos = 1 ; pos < word.length(); pos= pos + 2)// problem here. might have to do with (init, cond,state)
       {
           char c = word.charAt(pos); // initializing character and it  * pos = word.charAt(pos);*
           //reads the string and determines what character is at that position,  that part is important too. 
           System.out.print(c + " ");
   
       }
    
    }
    
}
