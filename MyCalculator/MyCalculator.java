import java.util.*;
public class MyCalculator
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
    
  int sum = Summation(int1,int2);
  int diff = Difference(int1,int2);
  int prod = Product(int1,int2);
  int divis = Divisible(int1,int2);
  System.out.println("Sum " + Summation(int1, int2));
  System.out.println("Difference " + Difference(int1, int2));
  System.out.println("Product " + Product(int1, int2));
  System.out.println("Quotient " + Divisible(int1, int2));
  //  System.out.println(isDivisible(int1,int2) + " ," + int2 + " is divisble" + int1);
 }
public static int Divisible(int x,int y)  //(int x,int y)
 {
  int int1 = x;
  int int2 = y;
   
  int Divisible = int1/int2;
  return Divisible;
 }
public static int Summation(int x,int y)
{
  int int1 = x;
  int int2 = y;
  
  int Summation = int1 + int2;
  return Summation;
}
public static int Product(int x, int y)
{
  int int1 = x;
  int int2 = y;
  
  int Product = int1 * int2;
  return Product;
}
public static int Difference(int x ,int y)
{
  int int1 = x;
  int int2 = y;
  
  int Difference = int1-int2;
  return Difference;
}
}