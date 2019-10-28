public class MyShapes
{
    public static void main (String[]args)
    {
        Rectangle r1 = new Rectangle(5,7);
        Rectangle r2 = new Rectangle(2,8);
        Rectangle s1 = new Square(3);
        Rectangle s2 = new Square(9);
        
        r1.printArea();
        r1.printPerim();
        r2.printArea();
        r2.printPerim();
        s1.printArea();
        s1.printPerim();
        s2.printArea();
        s2.printPerim();
        
    }
}
