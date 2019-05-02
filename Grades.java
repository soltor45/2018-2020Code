/*
 * demonstrates the use of logical or operator
 * || means or 
 */

import java.util.Scanner;

public class Grades
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       
       int grade; 
       char letterGrade; 
       
       System.out.println("Enter your number grade:");
       grade= s.nextInt();
       
       if(grade > 100 || grade < 0)    // error trap
       {
           System.out.println("That's not possible, silly.");
           letterGrade = 'I';
        }
        
     else if(grade>= 90)
       letterGrade= 'A';
     else if(grade>= 80)
       letterGrade= 'b';
     else if(grade>= 70)
       letterGrade= 'c';
     else if(grade>= 60)
       letterGrade= 'd';
     else 
      letterGrade = 'F';
         
        
        System.out.println("Your grade is " + letterGrade);
        
       
    }
    
}
