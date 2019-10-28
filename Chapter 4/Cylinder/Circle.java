public class Circle 
{
    private int radius;
    public Circle(int r)
     {
       radius = r;
     }
    public int getRadius()
     {
         return radius; 
     }
    public double getArea()
     {
         return Math.PI * Math.pow(radius,2);
     } 
}