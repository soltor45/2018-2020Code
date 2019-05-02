import java.util.Scanner;

public class MyCalculator
 {
     public static void main(String[] args)
     {
        double num1, num2, sum, difference, product; 
        Scanner scanmachine = new Scanner(System.in); // makes the scanner 
        
        System.out.println(" Enter first number");
      num1 = scanmachine.nextDouble();
        System.out.println(" Enter next number");
      num2 = scanmachine.nextDouble();
      sum = num1 + num2;
        System.out.println(" The sum is " + sum);
      difference = num1- num2;
        System.out.println(" The difference is" + difference);
      product = num1 * num2;
        System.out.println(" The product is" + product);
      
        
        }
    }
    