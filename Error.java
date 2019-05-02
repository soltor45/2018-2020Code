import java.util.Scanner;

public class Error 
{
    public static void main(String[] args)
       {
           int userNum;
           Scanner scanboi = new Scanner(System.in);
           
           System.out.println("Enter a number greater than 0");
           userNum = scanboi.nextInt();
           
           if(userNum <= 0)  // only picks up 1 line you need curly braces if multiple
             System.out.println("Invalid Number");
           else              // ifs and else don't use semi colons at the end 
             {
                 int newNum = userNum * 10; //process in some way
                 System.out.println(userNum + " is a valid number");
                 System.out.println(userNum + " x 10 = " + newNum);
                }
        }
    } 
    
    