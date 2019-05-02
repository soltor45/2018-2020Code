
// provides blueprint for making a single Animal onject
// actual Animal object must be made in a seperate client class (Zoo)

public class AnimalX
{
    //fields or instance variables
    // private- cant access directly outside class. if public anyone can access 
    
  private String type;
  private int legs;
  private boolean hair;   
  private boolean swim; 
  
    /*
     *constructor
      procedure for making one animal object
      usually initialize field values. give its animal its type bla, bla 
      always has the same name as the class 
     */
  public AnimalX(int inLegs, boolean inHair, String inType, boolean inSwim) // these are coming from the zoo class
    {
       
        legs =inLegs;
        hair=inHair;
        type = inType;
    }
    /*accessor methods
     * called by a specific animal object in client class
     * returns private field vallues of object to the client class (Zoo)
     */
  public int getLegs() // usually an accessor is getSomething
    {
        return legs;
    }
    
    
    public boolean getHair ()
    {
        return hair;
    }
    
    public String getType()
    {
        return type;
        
    }
    public boolean getSwim()
    {
        return swim;
        
    }
    
    

    
    
    //modifier methods
    //called by a speciifc object in client class
    // allows client class to change private fields value of object 
    
   public void setLegs(int inLegs)
   {
       legs = inLegs;
   }
   
   public void setHair(boolean inHair)
   {
       hair=inHair;
   }
    
    public void setSwim(boolean inSwim)
    {
        swim = inSwim;
    }
}
   
   
   