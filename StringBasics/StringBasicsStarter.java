
public class StringBasicsStarter
{
    public static void main(String[] args)
    {
        /*
            String objects can be created by using string literals
            or by calling the String class constructor.
        */

        // shortcut to make a new String - using a string literal
        String name = "Teni T.";
        // Using String class Constructor
        String job = new String("teacher");
        /*
            String objects can be concatenated using the + or += operator,
            resulting in a new String object.
        */
        String title = name + ": " + job;

        System.out.println(title);

        title +=" in Rockwood.";
        System.out.println(title);

        /*
            Primitive values can be concatenated with a String object.
            This causes implicit conversion of the values to String object.
        */

        // Careful - addition and concatenation have same precedence - so it's left to right

        System.out.println("The sum of 4 and 5 is " + 4 + 5);

        // need parentheses to make it add before concatenating to String
        System.out.println("The sum of 4 and 5 is " + (4 + 5));
        // OK b/c left to right (addition then concatentation)
        System.out.println(4 + 5 + " is the sum of 4 and 5 ");
        // no conflict here - multiplication before + (concat. or addition)
        System.out.println("The product of 4 and 5 is " + 4 * 5);
        System.out.println();

        /*
            Know the difference between empty Strings and null Strings.

            Empty Strings still refer to a an actual String object - the String is just empty.
            (The address in the reference variable is the address of the empty String)

            Null Strings are reference variable with a value of null - no String object exists
        */

       


        String empty1 = "";
        System.out.println("Here is empty string #1: " + empty1);
        
        String empty2 = new String();
        System.out.println("Here is empty string #2: ");
        System.out.println("The length of empty 2 is " + empty2.length());
        
        String nothing = null; // only reference - no object
        
        System.out.println("Here is string reference without object: " + nothing);

        /*
            Don't try to use a null reference (e.g., don't try to call method with it)
            until you set it equal to a String (newly created or otherwise)

            You will get a NullPointerException

            Uncomment the line below and see what happens!
        */

      // System.out.println(nothing.length());

        System.out.println();

        /*
            Escape sequences start with a \ and have a special meaning in Java.
            Escape sequences used in AP include \" and \\  and \n
        */

        System.out.println();   // skip a line

        System.out.println("Heres another way to skip lines\n\n\n\n\n"); // newline is \n

        System.out.println("\tAnd how to tab");  // tab is \t
        System.out.println();

        // To actually print a double quote you need \ before "
        System.out.println("\"Double Quotes\" need escape sequences ");

        // To actually print a backslash,  you need another \ before it
        System.out.println("Backward slash\\ needs two \\");

        System.out.println("Forward slash / does NOT need an escape");

        /*
            String objects are  immutable, meaning that String methods
            do NOT change the String object.

            Any method that seems to change a string actually creates a new string.
            The old string gets collected later by the automatic garbage collector.

            More on this to come ....
        */
    }
}

