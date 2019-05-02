import java.util.Scanner;

public class WhileLoops
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Here is your counter-controlled while loop: \n");
        int count ; 
        
        count=0;
       
        while (count <= 10)   // as long as count is less that 10 , its adds 1 // no ; 
        {
            System.out.println(count);
             
            count ++; // count = count + 1, goes back up to 11, but sees the while is more than 10 so it stops 
        }   
        
        
        System.out.println("\nHere is a flag-controlled while loop: \n");
        
        boolean contin = true;
        
        int value = 100;
        
       while (contin)   // while(continue ==true), sometime this will have to be false otherwise it will be infinite
       {
          System.out.println(value);
          value = value + 100;
          if(value >= 500)
             contin = false; 
           
       }
        
        System.out.println("\n Here is a Sentinel-controlled while loop; \n");
        
        int sum =0;
        int num;
        // as soon as a special value is entered the loop stops
        
        System.out.println("ENter a number to add to sum(0 to quit:"); // priming loop
        num = scan.nextInt();
        
        while (num != 0)
        {
            sum = sum + num;       // same as sum +=num
          
        System.out.println("ENter a number to add to sum(0 to quit):");
        num = scan.nextInt();  //this here is looping
        }
        
        System.out.println("Sum is " + sum);
        
    }
    
}