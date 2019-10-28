import java.util.Scanner;

public class MenuExample
{
    public static Scanner scan = new Scaqnner(System.in);
    
    public static void main(String[] args)
    {
        menu();
    }
    public static void menu()
    {
        System.out.prinln("\nChoose one of the following: \n");
        System.out.println("1. say Hello");
        System.out.println("2 add two numbers");
        System.out.println("3 quit");
        int choice = scan.nextInt();
    if (choice == 1)
    {
            sayHello();
            menu();
    }
    else if (choice == 2)
    {
        System.out.println(
    }
}