package misc;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.sound.sampled.*;
import java.io.*;

public class BobLabst
{
	public static void main(String...args) throws InterruptedException
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanelb m = new MyPanelb();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.
		j.setVisible(true); //allows the frame to be shown.
		j.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
		
		/*while (true) {  //Alternative to actionListener- change actionPerformed(ActionEvent e) to update()
			m.update();
			m.repaint();
			Thread.sleep(1000/60);  //60 corresponds to fps */
		}
	}

class MyPanelb extends JPanel implements MouseListener, ActionListener
{
	
	private Timer time;
	private int x,y;
	private int add;
	private Image car;
	private boolean death;
	static File file;
	static AudioInputStream stream;
	static Clip music;
	float step = (float).1;
	int dir = 1;
	float volume = 0;
	MyPanelb()
	{
		try
		{
		file = new File("C:\\Users\\devde\\eclipse-workspace\\GetLastProject\\src\\Tetris.wav");
		stream = AudioSystem.getAudioInputStream(file);
		music = AudioSystem.getClip();
		music.open(stream);
		music.start();
		music.loop(Clip.LOOP_CONTINUOUSLY);
		}
		catch(Exception e)	{
			
			System.out.println(e);
			System.exit(1);
		}
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(2000, 1500);
		setVisible(true); //it's like calling the repaint method.
		time.start();
		add=1;
		x=y=200;
		addMouseListener(this);
		addKeyListener(new KeyListener() 
		{
			public void keyPressed(KeyEvent e)
			{
				  int code = e.getKeyCode();
				  //System.out.println(code);
				  if(code==KeyEvent.VK_R)
					  y=1;
			}
			public void keyReleased(KeyEvent e)	{}
			public void keyTyped(KeyEvent e){}
		});
		try
		{
			car = ImageIO.read(new File("C:\\Users\\devde\\eclipse-workspace\\GetLastProject\\src\\Beautiful_Sky_with_Clouds_Background-803.gif"));
		}
		catch(Exception e)	{
			
			System.out.println(e);
			System.exit(1);
		}
		setFocusable(true);
	}
	
	/*public void setVolume(float volume) {
		FloatControl stupidFC = (FloatControl) music.getControl(FloatControl.Type.VOLUME);
		float range = stupidFC.getMaximum() - stupidFC.getMinimum();
		float gain = (float) ((range * volume) + stupidFC.getMinimum());
		stupidFC.setValue(gain);
	}
	*/
	  
	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(66, 173, 244));
		g.fillRect(0, 0, 2000, 1500);
		g.drawImage(car, 0, 0, null);
		drawBob(g,x,y);
		
	}
	
	public void drawBob(Graphics g, int x, int y)
	{	
		Color brn = new Color(160,82,45);
		g.setColor(Color.GREEN);
		if(death)
			g.setColor(brn);
		g.fillRect(765, 550-y, 20, 80);
		g.setColor(Color.PINK);
		if(death)
			g.setColor(brn);
		g.fillOval(730,500-y,50,50);
		g.fillOval(770,500-y,50,50);
		g.fillOval(750,520-y,50,50);
		g.fillOval(750,480-y,50,50);
		g.setColor(Color.GREEN);
		if(death)
			g.setColor(brn);
		g.fillOval(780,580-y,30,20);
		g.setColor(Color.YELLOW);
		g.fillOval(750,500-y,50,50);
		g.setColor(Color.BLACK);
		g.fillRect(730, 630-y, 80, 10);
		g.setFont(new Font ("Broadway", Font.BOLD, 20));
		if(death)
			g.drawString("Click to revive the flower", 55,55);
		else
			g.drawString("Click to kill the flower", 55,55);
		g.drawString("Click r to reset the flower", 55, 88);
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 700, 2000, 500);
		g.setColor(Color.BLACK);
		for(int q = 0; q<2000; q+=100)
			g.fillRect(0+q, 750, 10, 10);
		int [] xpts = {100,100,400,500};
		int [] ypts = {400,200,200,400};
		Polygon p = new Polygon(xpts,ypts,4);
		g.fillPolygon(p);
	}
	
	  
	public void mouseClicked(MouseEvent e)
	{ death = !death; }
	  
	public void mousePressed(MouseEvent e){}
	  
	public void mouseReleased(MouseEvent e){}
	  
	public void mouseEntered(MouseEvent e){}
	  
	public void mouseExited(MouseEvent e){}
  
	public void actionPerformed(ActionEvent e)
	{
		if (y >=470)
			y=1;
		x+=add;
		y+=add;
		if(x==200 && y==200)
			add*=-1;
		if(x==10 && y==10)
			add*=-1;
	/*	if (volume < 0 || volume > .9) dir *= -1;
		volume += 1.0/60;
		volume = volume % 1;
		//System.out.println(volume);
		//volume = (float)(Math.round(volume * 100) / 100.0);
		System.out.println(volume);
		setVolume(volume);*/
		repaint();
	}	
}

/*


//STAGE 5


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class stage5
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();
		MyPanel4 m = new MyPanel4();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

	    j.addKeyListener(m);
		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel4 extends JPanel implements ActionListener, MouseListener, KeyListener
{
	private Timer time;
	private int ox,oy,rx,ry;
	private int add;
	private int change;

	MyPanel4()
	{
		ox = oy = 10;
		rx=ry=300;
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(2000, 1500);
		setVisible(true); //it's like calling the repaint method.
		time.start();
		add = 1;
		change=1;
		addMouseListener(this);

		}


	public void paintComponent(Graphics g)
	{
		switch (change)
		{
			case 1: 	g.setColor(new Color(0, 150, 150)); break;
			case 2: 	g.setColor(new Color(150, 150, 0)); break;
			case 3: 	g.setColor(new Color(150, 0,150)); break;
		}

		g.fillRect(0, 0, 2000, 1500);

		myRect(g,rx,ry);
		myOval(g,ox,oy);

	    g.setColor(Color.DARK_GRAY);
		g.setFont(new Font ("Arial", Font.BOLD, 25));
        g.drawString("Click the mouse on the screem to move the square", 100,500);
 	    g.drawString("Press 1,2, or 3 to change background color", 100,600);
	}

	public void actionPerformed(ActionEvent e)
	{
		ox+=add;
		oy+=add;
		if(ox==200 && oy==200)
			add*=-1;
		if(ox==10 && oy==10)
			add*=-1;

		repaint();
	}

	public void myRect(Graphics g,int x, int y)
	{
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x-20,y-20,115,115);
		g.setColor(Color.RED);
		g.fillRect(x, y, 75,75);
	}
	public void myOval(Graphics g,int x, int y)
	{
	    g.setColor(Color.DARK_GRAY);
		g.fillOval(x-20,y-20,115,115);
		g.setColor(Color.RED);
		g.fillOval(x, y, 75,75);
	}

	public void mouseClicked(MouseEvent e)
	{
		rx = e.getX();
		ry = e.getY();
	//	repaint();
	}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}


	public void keyPressed(KeyEvent e)
	{
		  int code = e.getKeyCode();

		  switch (code)
		  {
		  	case '1': change = 1; break;
		  	case '2': change = 2; break;
		  	case '3': change = 3; break;
		  }

	}

	public void keyReleased(KeyEvent e)	{}
	public void keyTyped(KeyEvent e){}

}*/



/*


//STAGE 6


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;

public class stage6
{
	public static void main(String...args)
	{
		JFrame j = new JFrame();  //JFrame is the window; window is a depricated class
		MyPanel4 m = new MyPanel4();
		j.setSize(m.getSize());
		j.add(m); //adds the panel to the frame so that the picture will be drawn
			      //use setContentPane() sometimes works better then just add b/c of greater efficiency.

		j.setVisible(true); //allows the frame to be shown.

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes the dialog box exit when you click the "x" button.
	}

}

class MyPanel4 extends JPanel implements ActionListener  // extends JPanel to support the swing framework
{
	private Timer time;
	private int startX, startY;
	int x,y;
	int radius = 100;
	int centerX = 100;
	int centerY = 100;
	double radian;
	private int add;
	private Image car;

	MyPanel4()
	{
		startX = startY = 10;
		time = new Timer(15, this); //sets delay to 15 millis and calls the actionPerformed of this class.
		setSize(500, 500);
		setVisible(true); //it's like calling the repaint method.
		time.start();
		add = 1;
		

		try
		{
			car = ImageIO.read(new File("Car.gif"));
		}
		catch(Exception e)	{}
		
		// initails value for circle and circular movement
		radian=0;
		radius = 100;
 		centerX = 100;
		centerY = 100;
	}



	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
		g.drawImage(car, startX, 155, null);
		g.setColor(Color.BLACK);
		g.fillRect(startX, startY, 50, 50);
		g.setColor(Color.RED);
	 	g.fillOval(x, y, 50, 50);
	 	
	 	


	}

	public void actionPerformed(ActionEvent e)
	{
		startX+=add;
		startY+=add;
		if(startX==200 && startY==200)
			add*=-1;
		if(startX==10 && startY==10)
			add*=-1;


		x = (int) Math.round(Math.cos(radian) * radius) + centerX;
		y = (int) Math.round(Math.sin(radian) * radius) + centerY;

		radian += 0.05;

		repaint();
	}


}

*/

