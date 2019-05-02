/*
 * This is the client ( or driver) class which constructs
 * individual objects of type Animal ( by calling a constructor in the animal
 * class.)
 * 
 * After an individual object has been crrated, it can be used 
 * to call methods in the Animal class to get information about that
 * object, or make changes to that object
 */
import java.text.NumberFormat;
public class Bank
{
    public static void main (String[] args) // main is in client/driver class
    {
       //creating a new object from a class is called instantation
       //the keyword "new" is needed to create an objext
      
       //Make New Objects
       NumberFormat m = NumberFormat.getCurrencyInstance();  //Type and order of valuses must match construxtor in Animal Class
                          
       Account acct1 = new  Account("George","Wilson",12345,200.00);   // class name, name i picl = new class name, then all the constructors
       System.out.println("Name: " + acct1.getName());
       System.out.println("Number: " + acct1.getNumber());
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("");
       acct1.deposit(100.00);
       System.out.println("Depositing $100");
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("");
       acct1.deposit(350.00);
       System.out.println("Depositing $350");
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("");
       acct1.withdraw(300.00);
       System.out.println("Withdrawing $300");
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       
       System.out.println("");
       System.out.println("Withdrawing $1000"); //insufficent funds comes before 1000 
       acct1.withdraw(1000.00);
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("");
       System.out.println("Account Interest"); 
       acct1.interest();
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
       
       System.out.println("");
       System.out.println("Withdrawing $300"); //insufficent funds comes before 1000 
       acct1.withdraw(300.00);
       acct1.penalty();
       System.out.println("Balance: " + (m.format(acct1.getBalance())));
      

    }
}