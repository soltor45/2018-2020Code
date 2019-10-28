import java.util.Scanner;

public class Divisibility
{
 public static void main(String args[])
{ 
    boolean divisible = false;
    int int1;
    int int2;
    Scanner scan = new Scanner(System.in); 
    
    System.out.println("Enter your first number");
    int1 = scan.nextInt();
    
    System.out.println("Enter your second number");
    int2 = scan.nextInt();
    
    divisible = isDivisible(int1,int2);
  //  System.out.println(isDivisible(int1,int2) + " ," + int2 + " is divisble" + int1);
 }
 public static boolean isDivisible(int x,int y)  //(int x,int y)
 {
  boolean divis= true;
  int int1 = x;
  int int2 = y;
    if (int1 % int2 == 0)
    {
        System.out.println(int1 + " is divisible by " + int2);
        divis= true;
    }
    else
    {
       System.out.println(int1 + " is NOT divisible by " + int2);
       divis = false;
    } 
  return divis ; 
 }
}
