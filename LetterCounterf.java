import java.util.Scanner;

public class LetterCounterf
{
    public static void main(String[] args)
    {
        String word;
        int pos;
        boolean contin = true;
        int yourChar = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        word = scan.nextLine();
        
        System.out.println("Enter letter you want to count");
        char myChar = scan.nextLine().charAt(0);

    
         pos = 0;
         
         while(pos < word.length())
          {
              char c = word.charAt(pos);
              
              if (c == myChar)    
                yourChar++; 
              else
                yourChar = yourChar;
                
                pos++;
         }   
         
         System.out.println("The letter counted was " + myChar + " and there is " + yourChar);
}




}  