import java.awt.*;
import javax.swing.*;

public class CircleDriver extends JPanel
{
    //This statement defines a variable called circ1
	private Circle circ1;
    private Circle circ2;
    
	public CircleDriver()
	{
		setBackground(Color.BLACK);

    	//This statemente makes or "instantiates" a circle called "circ1"
    	//It has a starting position of (50,50),
    	// a diameter of 60, and the color blue

		circ1 = new Circle(50, 50, 60,Color.blue);
		
        circ2 = new Circle(50, 75,80 ,Color.green);
    }
	   public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

        //This statment draws the circle called "circ1"
         
         circ1.drawCircle(g);
         circ2.drawCircle(g);
	}

	public static void main(String[] args)
	{
		JFrame w = new JFrame("Draw Stuff");
		w.setBounds(0,0,1000, 600); //change size of window by changing last two values
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new CircleDriver()); //make sure this is the name of the class
		w.setVisible(true);
	}
}
