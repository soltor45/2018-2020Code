import java.lang.Object;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.util.Scanner;
public class CoorSegTester 
{
   public static void main (String[] args)
   {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter point 1 x value: ");
    double  x = scan.nextDouble();
    
    System.out.println("Enter point 1 y value: ");
    double  y = scan.nextDouble();
    
    System.out.println("Enter point 2 x value: ");
    int x1 = scan.nextInt();
    
    System.out.println("Enter point 2 y value: ");
    int y1 = scan.nextInt();
    
    CoorSeg p1 = new CoorSeg(x,y);
    CoorSeg p2 = new CoorSeg(x1,y1);
   /// Point p2 = new CoorSeg(x2,y2);
   
    System.out.println("x1 is: " + p1.getX(x));
    System.out.println("y1 is: " + p1.getY(y));
    System.out.println("x2 is: " + p2.getX(x1));
    System.out.println("y2 is: " + p2.getY(y1));
   }
}