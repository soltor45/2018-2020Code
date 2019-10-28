
import java.awt.Color;

public class Animal
{
    // fields or instance variables
    private String name;
    private boolean isAlive;
    private Color clr;      
    
    // default constructor (no args)
    public Animal()
    {
        name = "Snickers";
        isAlive = true;
        clr = Color.CYAN;
    }
    
    // overloaded constructor (with parameters)
    public Animal(String n, boolean i, Color c)
    {
        name = n;
        isAlive = i;
        clr = c;
    }   
    
    // Accessor method
    public String getName()
    {
        return name;
    }
    
    // Accessor method
    public boolean getIsAlive()
    {
       return isAlive;
    }
    
    // Accessor method
    public Color getClr()
    {
        return clr;
    }
    
    public void getMuddy()
    {
        clr = Color.BLACK;
    }
    
    public void kill()
    {
        isAlive = false;
        System.out.println("RIP " + name + "\n");
    }
}
