import java.util. Scanner;

public class SpecialPartyBoolean
{
    public static void main (String[] args)
    { 
        int age;
        Scanner scan= new Scanner (System.in);
        
        System.out.println("Enter age: ");
        age = scan.nextInt();
        
        boolean sweet16;  // variable thats either t or f
        sweet16 = (age ==16);
        
        boolean majority = (age==21);// do this or the first option for a boolean
        
        boolean adult = (age > 21);
        
        boolean decade = (age % 10 == 0);
        boolean quarter = (age % 25 == 0);
        
        if(sweet16 || majority || (adult && (decade || quarter)))
              System.out.println("Super special party, this year!");
        else
              System.out.println("One year older!!");
    }
}
