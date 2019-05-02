import java.util.Scanner;

public class U4_Prog2A
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
        
      System.out.println("Type the vowel, a"); 
      char myChar1 = scan.nextLine().charAt(0);
      
      System.out.println("Type the vowel, e "); 
      char myChar2 = scan.nextLine().charAt(0);
      
      System.out.println("Type the vowel, i"); 
      char myChar3 = scan.nextLine().charAt(0);
      
      System.out.println("Type the vowel, o"); 
      char myChar4 = scan.nextLine().charAt(0);
      
      System.out.println("Type the vowel, u"); 
      char myChar5 = scan.nextLine().charAt(0);
      
         pos = 0;
         
         while(pos < word.length())
          {
              char c = word.charAt(pos);
              
              if (c == myChar1 || c==myChar2 || c==myChar3 || c == myChar4 || c==myChar5)    
                yourChar++; 
              else
                yourChar = yourChar;
                pos++;
         }   
         
         
         System.out.println("There are " + yourChar + " vowels");
         System.out.print("The word has " + word.length() + " letters");

}




}     

