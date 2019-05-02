public class NestedForLoops
{ 
    public static void main (String[] args)
    {
        int i,j;
        
        for(i=1; i <= 3; i++)
        { 
            System.out.println("i = " + i + "      (outer loop)");
            
            for(j=1;j<=5; j++)
            {
                System.out.println("\t j = " + j + "    (inner loop)");
            }
            
        }
        System.out.println("\nMake a 3 x 7 rectangle withs stars:\n");
        
        for(int r=1; r<=3; r++) //rows 
          { 
              for (int c =1; c <=7; c++)   //columns
              {
                  System.out.print("* ");  // stay on the same line in inner loop
               }
                
                
                System.out.println();      // makes new line for new row
          }
            
        
        System.out.println("\n\n");
     
    }
        

}

