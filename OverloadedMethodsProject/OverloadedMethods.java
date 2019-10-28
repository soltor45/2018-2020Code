/*
    Method Overloading:

    Two methods of the same class may have the same name,
    but they must have different numbers or types of arguments.

    These methods are overloaded.

    However, the return type alone does not distinguish
    two methods.  The parameters must be different.
*/

public class OverloadedMethods
{
    public static void main (String[] args)
    {
        /*
            The bigger method should return the biggest
            of two values.

            If the two values are equal, return the first
            value, but also print that they are equal.

            Java knows which overloaded version to use based
            on the type and order of parameters being passed
            in the method call.
        */

        System.out.println("I understand that you want the bigger values.");

        System.out.println("The value you want is: " + bigger(3,7));

        System.out.println("The value you want is: " + bigger(3,3));

        System.out.println("The value you want is: " + bigger(3.8,7.0));
    }

    /*
        Overloaded version of bigger method that has
        2 int parameters and returns an int.
    */

   public static int bigger(int a, int b)
   {
       int output;
       if (a > b)
       {
           output = a;
       }
       else if ( a < b)
       {
           output = b;
       }
       else
       {
           output = a;
           System.out.println("The values are actually equal. ");
       }
       return output;
   }
    /*
        Overloaded version of bigger method that has
        2 double parameters and returns a double.
    */

   public static double bigger(double a, double b)
   {
       double output;
       if (a > b)
       {
           output = a;
       }
       else if ( a < b)
       {
           output = b;
       }
       else
       {
           output = a;
           System.out.println("The values are actually equal. ");
       }
       return output;
   }


}