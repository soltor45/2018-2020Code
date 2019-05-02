/*
 * This is the client ( or driver) class which constructs
 * individual objects of type Animal ( by calling a constructor in the animal
 * class.)
 * 
 * After an individual object has been crrated, it can be used 
 * to call methods in the Animal class to get information about that
 * object, or make changes to that object
 */
public class ZooX
{
    public static void main (String[] args) // main is in client/driver class
    {
       //crEATINg a new object from a class is called instantation
       //the keyword "new" is needed to create an objext
      
       //Make New Objects
       //Type and order of valuses must match construxtor in Animal Class
                          
         AnimalX simba = new  AnimalX( 4,true,"lion", false);   // class name, name i picl = new class name, then all the constructors
         AnimalX nemo =  new  AnimalX( 0,false,"fish", false);  // (sshhshsh) those are the arguments
         AnimalX scott =  new  AnimalX (4,false, "cow", false);
        
       // call accessor methods, cuz its privare
       
       System.out.println("Simba is a " + simba.getType()); // getTYPE IS public so we can use it to get the type 
       System.out.println("Simba has " + simba.getLegs() + " legs"); 
       System.out.println("Simba has hair? " + simba.getHair()); 
       System.out.println("Simba can swim?" + simba.getSwim());
      
         nemo.setSwim(true);
       System.out.print("\n");
       System.out.println("Nemo is a " + nemo.getType());
       System.out.println("Nemo has " + nemo.getLegs() + " legs"); 
       System.out.println("Nemo has hair? " + nemo.getHair()); 
       System.out.println("Nemo can swim? " + nemo.getSwim());
       
       System.out.print("\n");
       System.out.println("Scott is a " + scott.getType());
       System.out.println("Scott has " + scott.getLegs() + " legs"); 
       System.out.println("Scott has hair? " + scott.getHair()); 
       System.out.println("Scott can swim? " + scott.getSwim());
       
       
       // call modifier methods
       nemo.setLegs(2); //changes legs but isn't printing anythig yet, can't print 
       nemo.setHair(true); 
       nemo.setSwim(false);
       
       System.out.print("\n");
       System.out.println("Nemo now has " + nemo.getLegs() + " legs"); 
       System.out.println("Nemo now has hair? " + nemo.getHair()); 
       System.out.println("Nemo can now swim? " + nemo.getSwim());
    }
}