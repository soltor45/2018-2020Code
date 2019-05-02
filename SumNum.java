import java.util.Scanner;

public class SumNum
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Here is a Sentinel-controlled while loop \n");
        
        int sum =0, count=1;
        int num,now = 0,answer = 0;
        // as soon as a special value is entered the loop stops
        
        System.out.println("Enter the last number in your sum"); // priming loop
        num = scan.nextInt();
        
        System.out.print("0");
        while (count <= num)
        { 
            System.out.print(" + ");
            System.out.print(count);
            
            sum = sum + count;
            count ++;
        }
        
        System.out.println(" = " + sum);
       
}
}