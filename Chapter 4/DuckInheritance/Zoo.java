
/*
    Note the different issues related to calling methods

    Methods referring to a single object - call the method with the name of the object
    e.g., a1.kill()

    Methods that return information - are called in one of these ways:

        - information returned is printed
        - information returned is put into a variable

    Methods that don't return information (void methods) are
    called on their own line.
*/

import java.awt.*; // imports everything in awt package

public class Zoo
{
    public static void main(String[]args)
    {
        Animal a1 = new Animal();
        System.out.println(a1.getName() + " is alive? " + a1.getIsAlive());
        
        a1.kill();
        
        String myName = a1.getName();
        boolean myAlive = a1.getIsAlive();
        
        System.out.println(myName + " is alive? " + myAlive + "\n");
        
        Duck d1 = new Duck();  // default duck
        d1.printInfo();
        d1.kill();
        d1. printInfo();
        
        Duck d2 = new Duck("Howard", true, Color.WHITE,true, 5.6);
        
        d2.printInfo();
        d2.gainWeight(4.2);
        d2.getMuddy();
        d2.printInfo();
     }
}

