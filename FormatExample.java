import java.text.NumberFormat; // for money and percents
import java.text.DecimalFormat; //to specify decimal places

public class FormatExample
{
    public static void main(String[] args)
    {
        // NumberFormat examples
        // m and p below are just names- they could be anything
        
        // DecimalFormat are examples
        
        double num1 = 5.349;
        double num2 = .567;
        
        NumberFormat m = NumberFormat.getCurrencyInstance();
        System.out.println(m.format(num1));
        
        NumberFormat p= NumberFormat.getPercentInstance();
        System.out.println(p.format(num2));
        
        
         // DecimalFormay examples
        // f1 and f2 below are just names- they could be anything
        
        double num3 = 1.3789;
        double num4 = 1.37;
        
        DecimalFormat f1 = new DecimalFormat("0.###");
        System.out.println(f1.format(num3));
        
        DecimalFormat f2 = new DecimalFormat("0.000");
        System.out.println(f2.format(num3));
        
        
        
    }
}
        