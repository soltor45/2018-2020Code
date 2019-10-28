
// If numbers are not in 0-255 throws exception (run-time error)

import java.util.Scanner;

public class ShiftableColorDriver
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int rNum, gNum, bNum;

        System.out.println("Enter number from 0 to 255 for Red value:");
        rNum = s.nextInt();

        System.out.println("Enter number from 0 to 255 for Green value:");
        gNum = s.nextInt();

        System.out.println("Enter number from 0 to 255 for Blue value:");
        bNum = s.nextInt();

        // make Darker color object
        ShiftableColor sc1 = new ShiftableColor(rNum, gNum, bNum, true);
        
        System.out.println("Darkened Red Color Number: " + sc1.getShiftableColorRed());
        System.out.println("Darkened Green Color Number: " + sc1.getShiftableColorGreen());
        System.out.println("Darkened Blue Color Number: " +  sc1.getShiftableColorBlue() + "\n\n");

        // make Lighter color object
        ShiftableColor sc2 = new ShiftableColor(rNum, gNum, bNum, false);
        
        System.out.println("Lightened Red Color Number: " + sc2.getShiftableColorRed());
        System.out.println("Lightened Green Color Number: " + sc2.getShiftableColorGreen());
        System.out.println("Lightened Blue Color Number: " +  sc2.getShiftableColorBlue());

    }
}

