import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HBDay extends JPanel
	implements ActionListener
{
	private int numobjs = 7;
	private Candle candles[] = new Candle[numobjs];
	private Timer t;
	private int num = 1;

	public HBDay()
	{
		setBackground(Color.BLACK);

		candles[0] = new Candle(50, 50, false, Color.blue);
		candles[1] = new Candle(80, 50, true, Color.green);
		candles[2] = new Candle(110, 50, false, Color.magenta);
		candles[3] = new Candle(140, 50, true, Color.cyan);
		candles[4] = new Candle(170, 50, true, Color.orange);
		candles[5] = new Candle(200, 50, true, Color.white);
		candles[6] = new Candle(230, 50, true, Color.blue);

		t = new Timer(300, this);
		t.start();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		for (int count = 0; count < num; count++)
		{
			candles[count].drawCandle(g);
		}

		if (num >= numobjs)
		{
			g.setFont(new Font("myfont",2 ,24));
			g.drawString("Happy Birthday", 60, 175);
		}
	}

	public static void main(String[] args)
	{
		JFrame w = new JFrame("Draw Stuff");
		w.setBounds(0,0,1000, 600); //change size of window by changing last two values
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = w.getContentPane();
		c.add(new HBDay()); //make sure this is the name of the class
		w.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		num++;
		repaint();

		if (num >=numobjs)
		{
			t.stop();
		}
	}
}
