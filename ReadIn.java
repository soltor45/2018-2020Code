import java.util.Scanner; // need this to use Scanner class

public class ReadIn
{
    public static void main(String[] args)
    { // declare variables
    
    String day,book;
    int grade,siblings; 
    double height,gpa;
    
    Scanner scanmachine = new Scanner(System.in);  // make Scanner object
    
    System.out.println("When's your birthday?");
    day = scanmachine.nextLine();
    
    System.out.println("Favorite Book");
    book = scanmachine.nextLine();

    System.out.println("Grade");
    grade = scanmachine.nextInt(); 
    
    System.out.println("How many Siblings");
    siblings= scanmachine.nextInt();
    
    //if you want to read in a String after a number, you 
    // need to clear off the end of the line scanmachine.nextLine();
    
    scanmachine.nextLine(); // consumes new line left over
    
    System.out.println("Height"); 
    height = scanmachine.nextDouble();
    
    System.out.println("What's your GPA");
    gpa = scanmachine.nextDouble();
    
   // System.out.println("Your Address is "+ number + " " + street); 
   //   System.out.println("You Lived there " + years + " years"); 
   // System.out.println("Your City is " + city);
    
    }
}    
    
    