import java.util.Scanner;

public class Miles
{
    public static void main(String[] args)
    {
    double kilometers, miles;
    final double miles_to_km = 1.60935;
    
    Scanner scanmachine = new Scanner(System.in); 
    
    System.out.println(" Enter the distance in miles: ");
    miles = scanmachine.nextDouble(); 
    
    kilometers = miles * miles_to_km;
    System.out.println("This is your distance in km :" + kilometers);
    kilometers = scanmachine.nextDouble();
   }
}
    