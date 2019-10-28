public class Square extends Rectangle
{
    private double side;
    
    public Square(double si)
    {
        super(si, si);
        side = si;
    }
    
    public void printDiagonal(double disi)
    {
        disi = Math.sqrt(side);
        System.out.println("The diagonal length of the square is " + disi);
    }
}
    