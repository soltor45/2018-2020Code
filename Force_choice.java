import java.util.Scanner;
public class Force_choice
{
 public static void main (String[] args)
 {
     int choice;
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Pick number between 1 and 10");
     choice = scan.nextInt();
     
     while(choice< 1 || choice > 10)// in wrong rang
     {
        System.out.println("Invalid Number.");
         
        System.out.println("Pick number between 1 and 10"); // will force them to go until they do it right
        choice = scan.nextInt();
    }
    System.out.println("you picked" + choice);
}
}
