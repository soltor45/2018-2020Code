import java.util.Scanner; // need this to use Scanner class

public class ScannerPractice
{
    public static void main(String[] args)
    {
    // declare variables
    
    String street,city;
    int number; 
    double years;
    
    Scanner scanmachine = new Scanner(System.in);  // make Scanner object
    
    System.out.println("Enter street name");
    street = scanmachine.nextLine();
    
    System.out.println("Enter street number:");
    number = scanmachine.nextInt();
    
    System.out.println("Enter years at residence");
    years = scanmachine.nextDouble(); 
   
    //if you want to read in a String after a number, you 
    // need to clear off the end of the line scanmachine.nextLine();
    
    scanmachine.nextLine(); // consumes new line left over
    
    System.out.println("Enter city"); 
    city = scanmachine.nextLine();
    
    System.out.println("Your Address is "+ number + " " + street); 
    

    System.out.println("You Lived there " + years + " years"); 
    System.out.println("Your City is " + city);
    
    }
}    
    
    