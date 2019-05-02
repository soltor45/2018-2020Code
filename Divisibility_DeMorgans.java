
/*
 *  * to see if a # is divisible by an integer b, check to see if remainder after division is 0
 *    if(a%b == 0)
 *    
 *   this program also demonstrates one version of DeMorgan's law wh
 *   which states that the negation of a conjunction(&&)
 *   is the disjunction (||) of the negations.
 *
 */

import java.util.Scanner;

public class Divisibility_DeMorgans
{
public static void main (String[] args)
{
    int inNum;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter an integer: ");
    inNum = scan.nextInt();
    
    if ((inNum % 2 ==0) && (inNum % 3 ==0))
       System.out.println(inNum + " is divisible by 6");
    else
       System.out.println(inNum + " is not divisible by 6");
       
    // By demorgan's law, the aforementioned is the same as the following
    
    if(inNum % 2 != 0 || inNum % 3 != 0)
       System.out.println(inNum + " is not divisible by 6");
    else
       System.out.println(inNum + " is divisible by 6");
    
    }
}