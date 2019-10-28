public class WrappersExample
{
    public static void main (String[] args)
    {
        // Using the Integer wrapper class

        // construct an Integer object from int 734

        Integer obj1 = new Integer(734);
        
        // retrieve the (primitive) int value from the object
        int num1 = obj1.intValue(); // predefined method that returns the value
        
        System.out.println("num1 is " + num1);

        System.out.println("Maximum Integer is  "
                      + Integer.MAX_VALUE);

        System.out.println("Minimum Integer is  "
                      + Integer.MIN_VALUE);

        // Using the Double wrapper class
        Double obj2 = new Double(754.38);
        double num2 = obj2.doubleValue();

        System.out.println("num2 is " + num2);


        /*
            Newer versions of Java have autoboxing.

            The compiler can automatically convert
            the primitive (int) to the Wrapper class
            object (Integer) as needed.

        */
          Integer obj3 = 25;  // because of autoboxing, this works too
          Double obj4 = 9.234; // because of autoboxing, this works too
        /*
            Newer versions of Java also have UNboxing.

            The compiler can automatically convert
            the Wrapper class object (Integer) to
            the primitive (int) to  as needed.
        */


        // unboxing makes this work
        // unboxing makes this work



        /*
          Autoboxing will also work if you pass an int
          to a method expecting an Integer.

          Unboxing will also work if you pass an Integer
          object to a method expecting a primitive int.

          The same goes for doubles and Doubles.
        */
        int num3 = obj3; // unboxing makes this work
        double num4 = obj4; //unboxing makes this work,


        int x = 2; 
        System.out.println(tripleIt(2)); // were passing a primitive integer but its still going to work 
        Double obj = new Double(7.0);
        System.out.println(squareIt(obj)); 
    }

    // Separate Methods

    public static int tripleIt(Integer obj)
    {
        int num = obj.intValue();

        return num * 3;
    }

    public static double squareIt(double num)
    {
        return Math.pow(num, 2);
    }
}
