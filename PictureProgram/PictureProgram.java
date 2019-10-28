public class PictureProgram
{
    public static void main(String[] args)
  {
        /*
            Escape sequences start with a \ and have a special meaning in Java.
            Escape sequences used in AP include \" and \\  and \n
        */

   
        System.out.print("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        System.out.println("\\   \"          \"     \\");
        System.out.println("\\         ^          \\");
        System.out.println("\\     ________       \\");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        /*
            String objects are  immutable, meaning that String methods
            do NOT change the String object.

            Any method that seems to change a string actually creates a new string.
            The old string gets collected later by the automatic garbage collector.

            More on this to come ....
        */
    }
}
