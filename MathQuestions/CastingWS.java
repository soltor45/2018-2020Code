public class CastingWS
{
    public static void main(String args[])
    {
        int iResult=0, num1 = 25, num2 = 40, num3 = 17, num4=5;
        double dResult, val1 = 17.0;
       // System.out.println(52/100 + ((52 % 10) * 100)- (52 / 100) * 100) - (52 % 10));
        iResult = num1/num4;
        System.out.println(iResult);
        
        dResult = num1/num4;
        System.out.println(dResult);
        
        iResult = num3/num4;
        System.out.println(iResult);
        
        dResult = num3/num4;
        System.out.println(dResult);
        
        dResult = val1/num4;
        System.out.println(dResult);   
    }
}