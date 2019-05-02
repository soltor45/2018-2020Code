import java.util.Scanner;

public class PrintChar
{
    public static void main(String[] args)
    {
        int times;
        char urchar;
        int count;
       
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter a character");
        urchar = scan.nextLine().charAt(0);
        
        System.out.println("How Many Times Do You Want To Print: ");
        times = scan.nextInt();
        
        while (times <= 1)
         {
            
            System.out.println("Number must be positive");
            System.out.println("How Many Times Do You Want To Print: ");
            times = scan.nextInt();
            
         }
                 // while the time is greater than(or equal to) 1, print letter times amount of times 
      
           for (count = 1; count <= times; count++)
         {
             
            System.out.print ( urchar + " ");
          
          }
         System.out.println("\nYou asked to print ' " + urchar + " ' " + times + " times");

}

}     
