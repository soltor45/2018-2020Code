import java.util.Scanner;

public class Loopinaloop
{
    public static void main (String[] args)
    {
        String word;
        int pos;                     // position in a word (starts at 0)
        boolean contin = true;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        word = scan.nextLine();
        
        while (contin)    // the same as while (contin == true) 
        {
        
              pos = 0;  //reset position to 0 each time theres a new word
              System.out.println("Length of word: " + word.length());
              
              while (pos < word.length())           // last positon is word.length() -1
                    {
                        char c = word.charAt(pos); // what number is the letter at
                       System.out.println("position: " + pos + " character: " + c);
                        pos ++;                    // means pos= pos + 1;          
                    }
              System.out.println("There are ");
              char c = word.charAt(0); // error!!!
              
              if (word.equalsIgnoreCase("Q")) // equalsIgnoreCase takes both
                contin = false; 
              else
                contin = true;
      }  // to end the outer while loop
        
    }
}
