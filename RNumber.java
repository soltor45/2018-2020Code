import java.util.Random;   //need for random class
public class RNumber
{
    public static void main(String[] args)
    { 
        // Make a random number generator
        Random generator= new Random ();
        
        int num1;
        
        num1= generator.nextInt(10);
        System.out.println("From 0 to 9: " + num1); 
        
        num1= generator.nextInt(10) + 1;
        System.out.println("From 1 to 10: " + num1); 
        
        num1= generator.nextInt(15) + 20;
        System.out.println("From 20 to 34: " + num1);  //from 20 to 34
        
        num1= generator.nextInt(20) -10;   // we're starting at -10
        System.out.println("From -10 to 9: " + num1); 
        
        
        
    }
    
}
