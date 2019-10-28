// Formula: F = (9/5)C + 32
import java.util.Scanner;

public class TempConverter
{
    public static void main (String[] args)
    {
        int cTemp;
        double fTemp;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter temp. in Celsius: ");
        cTemp = scan.nextInt();
        
        fTemp = (9.0/5) *cTemp + 32;
        fTemp = (9/5.0) *cTemp + 32;
        fTemp= (9.0/5.0)*cTemp + 32;
        System.out.println("Temp. in Fahrenheit is " + fTemp);
        
        //fTemp = (double)(9/5) ** cTemp + 32; wouldn't work 
     
    }
}