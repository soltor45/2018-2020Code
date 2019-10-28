
// Example of Composition:  A Plantation "HAS-A" House
public class Plantation
{
    private int lotSize;
    private House h;        // field is reference of type House
    
    public Plantation(int lSize, int hSize)
    {
        lotSize = lSize;
        
        // Plantation constructor calls house constructor
        h = new House(hSize);    
    }
    
    public boolean passesZoning()
    {
        // passes zoning if house size is no more than 1/4 lot size
        
        boolean passes = false;
        
        // need accessor to get private field from house
        
        if(h.getSize() <= (.25 * lotSize))
        {   
            passes = true;
        }
        
        return true;
     }
}








