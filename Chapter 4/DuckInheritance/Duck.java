/*
    Example of Inheritance:  A Duck "IS-A" Animal
    
    Duck inherits fields and methods from Animal.
    
    However, fields in Animal are private and cannot be accessed directly.
    
    Duck can add its own new fields and methods.
    
    Duck can override (redefine) a method from Animal.
    
    Constructors are not inherited. (but constructors of superclass can be called)
*/
import java.awt.Color;

public class Duck  extends Animal
{
   // fields in addition to those from animal
   private boolean isFlying;
   private double weight;
   
   public Duck() // default constructor
   {
       // Call one constructor in Animal to initialize inherited fields
       super("Tyler", true, Color.YELLOW);
       
       isFlying = true;
       weight = 10.0;
    }
       
    public Duck(String n, boolean i, Color c, boolean f, double w)
    {
        super(n,i,c);        
        isFlying = f;
        weight = w;
    }
    
    public void gainWeight(double howMuch)
    {
        weight = weight + howMuch;
    }
    
    // override a method from Animal class
    public void kill()
    {
        super.kill();   // calls kill from Animal
        isFlying = false;
    }
    
    public void printInfo()
    {
        System.out.println("Name: "  + getName() + "\tIs Alive? " + getIsAlive());
        
        System.out.println("Color: " + getClr());
        
        System.out.println("Flying: " + isFlying + "\tWeight: " + weight + "\n");
     }
 }



