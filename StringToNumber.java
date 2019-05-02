import java.util.Scanner;

public class StringToNumber
{
    public static void main(String[] args)
    {
        String strGrade = "";    //initializing to empty string
        int intGrade = 0;        // initializing 0
        int nextGrade;      
        
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter you Grade:");
        System.out.println(" F for Freshman ");
        System.out.println(" S for Sophomore ");
        System.out.println(" J for Junior ");
        System.out.println(" SN for Senior ");
        
        strGrade = scan.nextLine();  // single letter, treat it like a string
        
        if(strGrade.equals("F"))
            intGrade = 9;
        else if (strGrade.equals("S"))
            intGrade=10;
        else if (strGrade.equals("J"))
            intGrade=11; 
        else if (strGrade.equals("SN"))
            intGrade=12;
            
      nextGrade = intGrade + 1;
      
      if(nextGrade ==10)
         System.out.println("Next year you will be a sophomore");
      if(nextGrade ==11)
         System.out.println("Next year you will be a junior");
      if(nextGrade ==12)
         System.out.println("Next year you will be a senior");
      if(nextGrade ==13)
         System.out.println("How was graduation?");
                
        }
        
    }
    
      
      