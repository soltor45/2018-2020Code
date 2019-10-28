
import java.util.Scanner;

public class BasicMethods
{
    public static void main(String args[])
    {
    Scanner scan = new Scanner(System.in);

// String and Escape Sequence Examples

        oneLineHellos();    //void methods are called all by themselves!
        multiLineHellos();
        multiLineWithEscape();

// Modulus/Remainder Examples

        System.out.println("\nThe remainder or modulus operator is %");
        System.out.println("Only use modulus with integers and positive numbers\n");
        System.out.println("9 % 4 is " + getRemainder(9, 4));
        System.out.println("3 % 7 is " + getRemainder(3, 7));

// If/Else and Equality Operator Examples

        System.out.println("\nEnter an integer: ");
        int num = scan.nextInt();

        boolean answer = equalToTen(num);

        System.out.println("\nYour number is equal to 10? " + answer);
// Using Constants Example

        System.out.println("\nEnter number of inches as integer: ");
        int inches = scan.nextInt();    // want decimal output

        System.out.println("That is the same as " + convertToFt(inches) + " feet");
// String as Parameter Example

        scan.nextLine();    // clear end of previous number input before reading in string

        System.out.println("\nEnter your name: ");
        String name = scan.nextLine();
        sayGoodbye(name);
    }

    // All methods called from main must be static because main is static

    // void method returns nothing
    public static void oneLineHellos()
    {
        System.out.print("Hello! ");
        System.out.print("Hello! ");
        System.out.println("Hello! ");  // skips to next line after this one
    }
    public static void multiLineHellos()
    {
        System.out.println();   // extra blank line
        System.out.println("Hello! ");
        System.out.println("Hello! ");
        System.out.println("Hello! ");
        System.out.println();
    }
    public static void multiLineWithEscape()
    {
        // you can also use escape sequence \n to skip line
        System.out.print("Hello! \nHello! \nHello!\n\n");
    }
    public static int getRemainder(int n1, int n2)
    {
        int mod = n1 % n2;

        return mod;
    }
    public static boolean equalToTen(int num)
    {
        boolean result;

        // assignment operator is =
        // equality operator is ==

        if(num == 10)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }
    public static double convertToFt(int in)
    {
        // Declare a constant with final.  Once initialized, it can't be changed;
        // Style convention is UPPERCASE for constants

        final int INCHES_PER_FOOT = 12;

        double feet = in / (double)INCHES_PER_FOOT;

        return feet;
    }

    public static void sayGoodbye(String n)
    {
        System.out.println("Goodbye, " + n);
    }
}
