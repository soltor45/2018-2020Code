public class Rectangle
{
    private double base;
    private double height;
    
    public Rectangle(double ba, double hi)
    {
        base = ba;
        height = hi;
    }
    
    public double getbase()
    {
        return base;
    }
    
    public double getheight()
    {
        return height;
    }
    
    public void printPerim()
    {
       double perim = base + base + height + height;
        System.out.println("The perimeter is " + perim);
    }
    
    public void printArea()
    {
        double area = base * height;
        System.out.println("The area is " + area);
    }
        
    
}
    
    

    
