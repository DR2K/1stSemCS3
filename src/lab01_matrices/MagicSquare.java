package lab01_matrices;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;

public class MagicSquare
{
	private int[][] myMagic;

	public MagicSquare()
	{
		setSize(0);
	}

	public MagicSquare(int size)
	{
		setSize(size);
	}
	
	public void setSize(int size)
	{
		// initialize the matrix MyMagic here
		myMagic= new int [size][size];
	}

	public void createMagic()
	{
		int num = 1;
		myMagic[0][myMagic.length/2]= num;
		int row = 0;
		int col = myMagic.length/2;
		num++;
		while(num<myMagic.length*myMagic.length)
		{
			row--; col++;
			if(row<0)
				row=myMagic.length-1;

			if(col>=myMagic.length)
				col=0;

			boolean full = true;
			while(full)
			{
				if(myMagic[row][col]==0)
				{
					myMagic[row][col] = num;
					num++;
					full=false;
				}
				else
				{
					row++; col--;
					if(col<0)
						col=myMagic.length-1;

					if(row>=myMagic.length)
						row=0;
					row++;
				}
			}
		}

	}

	public String toString( )
	{
		String output="";
		for(int r = 0; r < myMagic.length; r ++)
		{
			for(int c = 0; c < myMagic.length; c++)
			{
				output+=myMagic[r][c]+"\t";
			}
			output+="\n";
		}
		out.println();
		return output;
	}
}