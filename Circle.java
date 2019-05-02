  import java.awt.*;

public class Circle
{
	//This is the "instance data" for a Circle.
	//Each Circle "has-a".......
	//...starting x position
	//...starting y position
	//...diameter
	//...Color

	private int myx;
	private int myy;
	private int mydiameter;
	private Color mycolor;

 	public Circle(int inx, int iny, int indiameter, Color incolor)  //these are the parameters
 	{

 		//Complete these statements to "assign" the input values to the correct "instance data"

		 myx = inx;
		 myy = iny;			// the ______ shows where you will need to add code
		 mydiameter = indiameter;
		 mycolor = incolor;
	 }

	 public void drawCircle(Graphics g)
	 {
		  g.setColor(mycolor);

		  //Below, add a statement to draw a cirle.  See the API code, under Graphics
		  //You'll need to pass the starting x, starting y, width and height

		  g.drawOval(myx,myy,mydiameter,mydiameter);
	 }
 }