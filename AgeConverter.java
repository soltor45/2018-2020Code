import java.util.Scanner;

public class AgeConverter
{
    public static void main(String[] args)
    {
    int months,years,total_age, remain_months;
    final int months_in_year= 12;
    
    Scanner scanmachine = new Scanner(System.in); 
    
    System.out.println(" Enter age in months ");
    months = scanmachine.nextInt(); 
    
    years= months/ months_in_year;         //will drop decimal
    remain_months = months % months_in_year;   // calculate remaindert 
    
    System.out.println(" You are: " +  years +  "years" +  remain_months +  "months");
     
   }
}
    