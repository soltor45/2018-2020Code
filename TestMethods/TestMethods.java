import java.util.Scanner;

public class TestMethods
{
    public static void main(String[] args)
{
     int value;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an integer: ");
    value = sc.nextInt();
   
    if (value == 0)
    {
        System.out.println("Result: " + calcData());
    }
    else if(value % 2==0)
    {
         System.out.println("Result: " + calcData(value, value + 2));
    }
    else 
    {
         System.out.println("Result: " +  calcData(value));
    }
}
    public static String calcData()
    {
        String hello = "hello";
        return hello;
    }
    public static int calcData(int x,int y)
    {
        
        return (x+ y);
    }
    public static double calcData(int x)
    {
       
        return (x/7.0);
    }
   
}
