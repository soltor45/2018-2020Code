import java.util.Scanner;

public class LineSegTester
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter point A");
		int a = scan.nextInt();

		System.out.println("Enter point B");
	    int b = scan.nextInt();
	    
	    Lineseg seg1 = new Lineseg(a, b);
	    
	    double ans = seg1.calcMidpoint();
	    
	    System.out.println("Midpoint: " + ans);

	}

}