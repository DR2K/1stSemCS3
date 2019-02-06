package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.*;

public class PascalsTriangle
{
	private int[][] mat;

	public PascalsTriangle()
	{}

	public PascalsTriangle(int size)
	{
		mat = new int[size][size];
		createTriangle();
	}

	public void createTriangle()
	{
		
		for(int r =0;r<mat.length;r++)
			for(int c = 0;c<=r;c++)
			{
				if(c==0||c==r)
					mat[r][c]=1;
				else
					mat[r][c]=mat[r-1][c-1]+mat[r-1][c];
			}
	}

	public String toString()
	{
		String output = "";
		for(int x=0;x<mat.length;x++)
			output = output+ Arrays.toString(mat[x])+"\n";
		return output;
	}
}