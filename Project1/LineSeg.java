public class LineSeg
{
    /*
        If fields are not initialized,Java provides
        a default value of 0 for numbers, false for
        booleans, and null for objects.
    */

    // fields
    
    private int a;
    private int b;

    public LineSeg(int a, int b)//constructor
    {
        this.a=a;  //local variable only exists during constructor
        this.b=b;
        /*
            this.a refers to the field a which can be accessed
            throughout this class.

            In this constructor, the variable 'a' is only
            a local variable which holds the value of the parameter
            passed from the client. This local variable ceases to
            exist after the constructor has completed.
        */
    }
    public int calcDistance()
    {
        
        int dist;  // local variables DONT get default values
                   // local variables are destroyed when method ends
                   //fields are acailable throughout the entire clAA
        dist = Math.abs(a-b);
        return dist;
        
        
    }
    
    
    
    
}