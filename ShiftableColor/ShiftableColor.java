/*
    How is the color of a pixel recorded?
    It can be represented using the RGB (Red, Green, Blue) color model,
    which stores values for red, green, and blue, each ranging from 0 to 255.

    Black is (0,0,0).   White is (255,255,255)  (Bigger Number is lighter)

    Java represents color using the java.awt.Color class.
    The awt stands for Abstract Windowing Toolkit. You can use just the
    short name for a class, like Color, as long as you include an import
    statement at the beginning of a class source file.

     The RGB color model sometimes also stores an alpha value as well as the
     red, green, and blue values. The alpha value indicates how transparent
     or opaque the color is.
*/

// need import for Color class in API  (find package)
import java.awt.Color; 

public class ShiftableColor
{
    private static final double DARKENING_FACTOR = 0.05;

    // reference type of to hold address of Color object
    // no object exists yet - default value is null
    // field
    private Color clr;
    



    // Constructor     -  true for darker

 public ShiftableColor(int r, int g, int b, boolean darker)
    {
        // Makes Color object
        // Reference (memory address)is returned to clr variable

        clr = new Color(r,g,b);
        if(darker)
            this.darken();
        else
            this.lighten();
    }
 private void darken()
    {
        int red = (int) ( clr.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) ( clr.getGreen()  * (1 - DARKENING_FACTOR));
        int blue = (int) ( clr.getBlue()  * (1 - DARKENING_FACTOR));

        /*
            If darkening or lightening would put a color number
            outside of acceptable range - don't change that one.
        */

        if(red < 0 || red > 255)
             red =  clr.getRed();               // don't change
        if(green < 0 || green > 255)
             green =  clr.getGreen();              // don't change
        if(blue < 0 || blue > 255)
             blue = clr.getBlue();                // don't change
        /*
            Create new Color object and set field (reference variable)
            to hold address of new Color object.
        */
       clr = new Color(red,green,blue);
    }
 private void lighten()
    {
        int red = (int) ( clr.getRed()  * (1 + DARKENING_FACTOR));
        int green = (int) ( clr.getGreen() * (1 + DARKENING_FACTOR));
        int blue = (int) ( clr.getBlue () * (1 + DARKENING_FACTOR));

        if(red < 0 || red > 255)
             red = clr.getRed();                // don't change
        if(green < 0 || green > 255)
             green =  clr.getGreen();              // don't change
        if(blue < 0 || blue > 255)
             blue =  clr.getBlue();               // don't change
        /*
            Create new Color object and set field (reference variable)
            to hold address of new Color object.
        */
       clr = new Color (red,green,blue);
    }
    // Accessor Methods
 public int getShiftableColorRed()
    {
        return clr.getRed();

    }

 public int getShiftableColorGreen()
    {
        return clr.getGreen();

    }

 public int getShiftableColorBlue()
    {
        return clr.getBlue();

    }
}
