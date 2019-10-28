public class CoinPurseTester
{
    public static void main(String[] args)
    {
        CoinPurse cp1 = new CoinPurse (4,10,5,6);
        
        // won't compule until you finish coinourse
        System.out.println("Purse contents: " + cp1.printInfo());
        cp1.simplifyCoins();
        System.out.println("Purse contents: " + cp1.printInfoSimp());
        
        
        
    }
}
