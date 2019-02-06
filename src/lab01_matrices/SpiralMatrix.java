package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class SpiralMatrix
{
	private int[][] spiral;

	public SpiralMatrix()
	{
		setSize(0);
	}

	public SpiralMatrix(int size)
	{
		setSize(size);
	}
	
	public void setSize(int size)
	{
		spiral  = new int[size][size];
	}

	public void createSpiral()
	{
		int length = spiral.length;
		int row = 0;
		for(int num = 0;num<spiral.length*spiral.length;)
		{
			for(int d = row;d<length;d++)
			{
				spiral[d][row] = ++num;
			}
			for(int o = row+1;o<length;o++)
			{
				spiral[length-1][o] = ++num;
			}
			for(int u = length-1;u>row;u--)
			{
				spiral[u-1][length-1] = ++num;
			}
			for(int ov = length-1;ov>row+1;ov--)
			{
				spiral[row][ov-1] = ++num;
			}
			row++; length--;
		}


	}

	public String toString( )
	{
		String output="";
		for(int r = 0; r < spiral.length; r ++)
		{
			for(int c = 0; c < spiral.length; c++)
			{
				output+=spiral[r][c]+"\t";
			}
			output+="\n";
		}
		out.println();
		return output;
	}
}