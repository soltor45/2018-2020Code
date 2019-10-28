
/*  In Java, all classes form one large hierarchy rooted in the class Object.

    The toString() method is provided from the Class Object.

    By default, the toString() method prints the class name followed by the
    memory address of the object in hex, which is not very useful.

        Example:  MyFraction@1f33675

    Generally, you will want to override the toString() method of the Object
    Class and write your own version of toString().  This way you can
    provide your own unique (String) representation of your object.

    To override the default version, your method must have the same signature:

            public String toString()
*/

public class MyFraction
{
    private int num;
    private int denom;

    public MyFraction(int n, int d)
    {
        num = n;
        denom = d;

    }

    // more methods here

/*
    Here's an example of overriding the toString()
    method to represent a fraction in String form
*/
    public String toString()
    {
        return num + "/" + denom;  //has to return a string
    }


    // CODE GOES HERE



}

