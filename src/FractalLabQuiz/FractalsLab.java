package FractalLabQuiz;// Lab32bst.java
// The student version of the Lab32b assignment.


import java.awt.*;
import java.awt.event.*;


public class FractalsLab
{
	public static void main(String args[])
	{
		GfxApp gfx = new GfxApp();
		gfx.setSize(1024,768);
		gfx.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		gfx.show();
	}
}


class GfxApp extends Frame
{
	
	public void paint (Graphics g)
	{
		drawSquare1(g,1024,768,1024/2-1024/8,768/2-768/8);
	}
	
	public void drawSquare1(Graphics g, int maxX, int maxY,int startX,int startY)
	{
		g.setColor(Color.BLACK);
		g.fillRect(startX,startY,maxX/4,maxY/4);
		if(maxX>0)
		{
			delay(50);
			drawSquare1(g,maxX/2,maxY/2,startX-(maxX/8),startY-(maxY/8));
			drawSquare1(g,maxX/2,maxY/2,startX+(maxX/4),startY-(maxY/8));
			drawSquare1(g,maxX/2,maxY/2,startX-(maxX/8),startY+(maxY/4));
			drawSquare1(g,maxX/2,maxY/2,startX+(maxX/4),startY+(maxY/4));
		}
	}
	
	
	
	private void delay(double n)
	{
		for (double k = 1; k < n; k+=0.001);
	}
			
}


