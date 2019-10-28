import java.util.Scanner;
import java.text.NumberFormat;

public class CashRegister
{
    private static final double TAX_RATE=0.0625;
    private static NumberFormat fmt = NumberFormat.getCurrencyInstance();

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double beforeTax,payingWith,subtract;
        
        System.out.print("Enter your total before tax: ");
        beforeTax = scan.nextDouble();
        
        System.out.println("This is your total after tax: " + round(addTax(beforeTax)));
        System.out.println("Enter the amount you're paying with: ");
        payingWith = scan.nextInt();
        subtract = payingWith - round(addTax(beforeTax));
        System.out.println(" Your change is " + round(subtract));
        computeChange(subtract);
        


    }

    public static double addTax(double d)
    {
        d = (d + d * TAX_RATE);
        return d;   
    }


    public static double round(double d)
    {
       double cents = d*100;   // 8.319375 * 100 = 831.9375
       cents   =  (int) (cents + 0.5); //831.9375 + 0.5 = 832.353663 (int) = 832 cents 
       d = cents / 100;
       return d;
    }


    public static void computeChange(double d)
    {
        d = d*100;

        int dConv=(int)d;

        int twenties = dConv/2000;

        int tens =(dConv%2000)/1000;

        int fives =((dConv%2000)%1000)/500;

        int ones = (((dConv%2000)%1000)%500)/100;

        // You do quarters, dimes, nickels, and pennies
        int quarters = (((((dConv%2000)%1000)%500)%100)/25);
        int dimes = (((((dConv%2000)%1000)%500)%100)%25/10);
        int nickels = (((((dConv%2000)%1000)%500)%100)%25/10);
        int pennies =(((((((dConv%2000)%1000)%500)%100)%25%10)%5)/1);
        System.out.println("\n\nTwenties  Tens  Fives  Ones  Quarters  Dimes  Nickels  Pennies");
        System.out.println("------------------------------------------------------------------");
        System.out.println("   " + twenties + "\t   " + tens + "\t  " + fives + "\t " + ones
                          + "\t" + quarters + "\t" + dimes + "\t" + nickels + "\t" + pennies);

        // the escape sequence \t causes a tab
    }
    
}