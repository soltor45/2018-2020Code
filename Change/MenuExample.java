import java.util.Scanner;

public class MenuExample
{
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        menu();
    }
    
    public static void menu()
    {
        System.out.println("\nChoose one of the following:\n");
        System.out.println("1 = say Hello");
        System.out.println("2 = add two numbers"); 
        System.out.println("3 = quit");   
        
        int choice = scan.nextInt();
        
        if(choice == 1)
        {
            sayHello();
            menu();
        }
        else if(choice == 2)
        {
            System.out.println("Enter first number: ");
            int num1 = scan.nextInt();
            
            System.out.println("Enter second number: ");
            int num2 = scan.nextInt();
            
            System.out.println("Sum: " + calcSum(num1, num2));            
            menu();
        }
        else if(choice == 3)
        {
            System.out.println("Goodbye");
            
            // DON'T CALL MENU HERE
        }
        else
        {
            System.out.println("Invalid entry");
            menu();
        }
    }
        
    public static void sayHello()
    {
        System.out.println("Hello");
    }
    
    public static int calcSum(int n1, int n2)
    {
        return n1 + n2;
    }
}










