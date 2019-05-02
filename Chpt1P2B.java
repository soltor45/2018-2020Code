import java.awt.*;
import javax.swing.*;



public class Chpt1P2B extends JPanel
{
	public Chpt1P2B()
	{
         // set background color here
         setBackground(Color.PINK); 
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		// use methods from Graphics class to draw on panel
           g.setColor(Color.BLACK);
           g.drawString("Look at my cool designs",200,200); // ("what", start x, start y) red line 
       
           g.setColor(Color.YELLOW);
           g.fillRect(60,60,70,40);
           g.drawRect(60,60,70,40);//  (start x, start y, width, length)yellow rect 
         
           g.setColor(Color.BLUE);
           g.drawOval(100,20,50,50); // (vertex x, y, width, length)blue circle
       
           g.setColor(Color.RED);
           g.drawLine(0,0,300,300); // (x1,y1,x2,y2)
           
        }
          
public static void main(String[] args)
	
	{
		// sets up panel (Don't have to know this part)

		JFrame w = new JFrame("Draw Stuff");
		w.setBounds(0,0,1000,600);//last 2 nums - window size
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new Chpt1P2B());
		w.setVisible(true);
	}
}

