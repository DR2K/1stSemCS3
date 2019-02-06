// Lab32ast.java
// The student version of the Lab32a assignment.
package lab09_recursion;

import java.awt.*;
import java.awt.event.*;

public class Lab32ast
{
	public static void main(String args[])
	{
		Windows win = new Windows();
		win.setSize(1250,750);
		win.addWindowListener(new WindowAdapter() {public void
		windowClosing(WindowEvent e) {System.exit(0);}});
		win.show();
	}
}


class Windows extends Frame
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		paintSquare(g,200,0,50);
		paintSquareUp(g,20,10,550);
	}

	public void paintSquare(Graphics g, int length, int x,int y)
	{
		g.fillRect(x,y,length,length);
		if(length>4)
		{
			paintSquare(g,length-20,x+length+5,y+20);
		}
	}

	public void paintSquareUp(Graphics g, int length, int x,int y)
	{
		g.fillRect(x,y,length,length);
		if(length<200)
		{
			paintSquareUp(g,length+20,x+length+5,y-20);
		}
	}

}



