
import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int userIn = 0;
        int even = 0;
        int odd = 0;
        String choice;
        boolean contin = true;
        
        System.out.println("Enter a positive integer, negative to stop");
            userIn = scan.nextInt();
        
        while(contin)
        {    
            while(userIn >=0)
        
            {
            
                if(userIn % 2 == 0)
                even++;
                else if(userIn % 2 != 0)  
                odd++;

                System.out.println("Enter a positive integer, negative to stop");
                userIn = scan.nextInt();  
        
            }
            System.out.println("Even: " + even + " Odd: " + odd);
            
            scan.nextLine();
            
            System.out.println("Do you want to start over? Y or N");
            choice = scan.nextLine();
        
            if(choice.equalsIgnoreCase("Y"))    // fix { and ifs
            {
                contin = true;
                
                even = 0;
                odd = 0;
            
                System.out.println("Enter a positive integer, negative to stop");
                userIn = scan.nextInt();
            }
            else if(choice.equalsIgnoreCase("N"))
            contin = false;
            
            
            
        }
        
            
            
        
        
       
        
            
        
    }
}
