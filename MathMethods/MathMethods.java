
import java.util.Scanner;

public class MathMethods
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int num1;	// use numbers that average to a decimal
		int num2;

		System.out.println("Enter a first integer: ");
		num1 = s.nextInt();

		System.out.println("Enter a second integer: ");
		num2 = s.nextInt();

        int sum = add(num1,num2);
        System.out.println("Sum:" + sum);

// Calling a Function that Calls another Function
        System.out.println("Average: " + avg(num1,num2));
        

// Using int division and remainder operator together
// This function converts a total number of inches into feet and inches

		System.out.println("\nEnter number of inches as an integer: ");
		int inches = s.nextInt();
		printFtInches(inches);
    }
	public static int add(int n1,int n2)     // static because static methods can only call static methods 
	{
	  int sum = n1+ n2;
	  return sum;
   }
   public static double avg(int x, int y)
   {
       int sum = add(x,y);   //calls add method
       return sum / 2.0;
   }
   public static void printFtInches(int totalInches)  //because its void it csnt be printed or anything must be called likeThis();
   {
       int ft = totalInches /12;
       int in = totalInches % 12;
       
       System.out.println(ft + " feet and " + in + " inches");
   }
}
