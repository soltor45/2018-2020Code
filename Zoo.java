/*
 * This is the client ( or driver) class which constructs
 * individual objects of type Animal ( by calling a constructor in the animal
 * class.)
 * 
 * After an individual object has been crrated, it can be used 
 * to call methods in the Animal class to get information about that
 * object, or make changes to that object
 */
public class Zoo
{
    public static void main (String[] args) // main is in client/driver class
    {
        //crEATINg a new object from a class is called instantation
        //the keyword "new" is needed to create an objext
        
        
        //Make New Objects
        //Type and order of valuses must match construxtor in Animal Class
        
       //                         
         Animal simba = new  Animal( 4,true,"lion");   // class name, name i picl = new class name, then all the constructors
         Animal nemo =  new  Animal( 0,false,"fish");  // (sshhshsh) those are the arguments
        
        
       // call accessor methods, cuz its privare
       
         System.out.println("Simba is a " + simba.getType()); // getTYPE IS public so we can use it to get the type 
         System.out.println("Simba has " + simba.getLegs() + " legs"); 
         System.out.println("Simba has hair? " + simba.getHair()); 

       // call modifier methods 
       nemo.setLegs(2); //changes legs but isn't printing anythig yet, can't print 
       nemo.setHair(true);
       
       System.out.println("Nemo has " + nemo.getLegs()); 
       System.out.println("Nemo has hair? " + simba.getHair()); 

      
       
    }
}