public class Lineseg
{
    private int a;
    private int b;

    public Lineseg(int a, int b)
    {
        this.a =a;
        this.b =b;
    }
    
    public double calcMidpoint()
    {
        double mid = ((double)(a+b))/2;
        return mid;
    }
}