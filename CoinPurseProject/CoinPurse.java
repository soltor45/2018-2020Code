
// Students to complete getTotal and simplifyCoins methods below.

 /*
        In Java, objects of a class each have their own
        field values in memory for non-static (regular) fields
        (like the quarters field below).  The values for these fields
        can be different for every object (instance) of the class.
        (One CoinPurse object may have 7 quarters while another
        CoinPurse object may have only 2 quarters.)

        On the other hand, static fields belongs to the class as a whole,
        not to individual objects of the class.  All objects of
        the class share the same one static field variable which
        can hold only one value at a time. (The QUARTER_VALUE field
        has only one value which is shared by all objects of the class.)

        Java static fields can also be declared final.  A field declared
        static and final is called a "constant".  Once that value has been
        set, it cannot be changed again.
 */

import  java.text.NumberFormat;      // for money

public class CoinPurse
{
   // regular (non-static) fields, also called instance variables
private int quarters; // everyone has access to this 
private int dimes; 
private int nickels;
private int pennies;
private int cents ;
   // formatter for currency
private NumberFormat fmt = NumberFormat.getCurrencyInstance(); // kinda like a scanner
   // static fields
   // also called class variables
   // these static fields are also constants (final)
private static final double QUARTER_VALUE = 0.25;             //static makes it for the whole class
private static final double DIME_VALUE = 0.10;     
private static final double NICKEL_VALUE = 0.05;     
private static final double PENNY_VALUE = 0.01;     
   // constructor
public CoinPurse(int q, int d, int n, int p) //would say CoinPurse cp1 = new CoinPurse(1,2,3,4);
{
    quarters = q; // q is a local value which is why we set it equal ro something so it can be accessed from outside of it 
    dimes = d;
    nickels = n;
    pennies = p;
    
}
public double getTotal() // STUDENTS COMPLETE// this works correctly 
   {
     double total = ((quarters*QUARTER_VALUE)+(dimes*DIME_VALUE)+(nickels*NICKEL_VALUE)+(pennies*PENNY_VALUE));
     return total;
   }
   //get total money and use it to make change with the least number of coins
public void simplifyCoins() // STUDENTS COMPLETE
  {
      quarters =(int) (getTotal() /QUARTER_VALUE);
      int rQuarters = (int) ((getTotal()*100) % 25);
      dimes = (int) (rQuarters /10);
      int rDimes = (int) (rQuarters % 10);
      nickels = (int) (rDimes /5);
      int rNickels = (int) (rDimes % 5);
      pennies = (int) (rNickels / 1);
      int rPennies = (int) (rNickels % 1);
  }
  //method that prints the contents of purse
public String printInfo()  //ms.maricic wrote this 
   {
        System.out.println("Here's my purse");
        String contents = "\nQuarters: " + quarters
            + "\nDimes: " + dimes + "\nNickels: " + nickels
            + "\nPennies: " + pennies +  "\nTotal: " + fmt.format(getTotal())+  "\n\n";

        return contents;
   }
 public String printInfoSimp()  //ms.maricic wrote this 
   {
        System.out.println("Here's my simplified purse");
        String contents = "\nQuarters: " + quarters
            + "\nDimes: " + dimes + "\nNickels: " + nickels
            + "\nPennies: " + pennies +  "\nTotal: " + fmt.format(getTotal());

        return contents;
   }
}

  
   
 /*  String theSimplified = "\nCoin Purse Contents:\nQuarters: " + quarters
            + "\nDimes: " + dimes + "\nNickels: " + nickels
            + "\nPennies: " + pennies +  "\nTotal: " + fmt.format(getTotal());
            
              double cents =(int) getTotal() * 100;
   quartes = cents % 25;
   quarters = cents / 25;
   dimes = quarters / 10;
   dimes = dimes % 5;
   nickels = dimes /5;
   pennies = nickels /5; 
   int nextByNickels = 1;
   int nextByPennies = 1;
            
*/








