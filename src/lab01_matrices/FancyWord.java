package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.util.*;


public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		mat=new char[0][0];
	}

   public FancyWord(String word)
	{
		mat = new char[word.length()][word.length()];
		
		for(int r = 0;r<mat.length;r++)
			for(int c=0; c<mat[r].length; c++)
			{
				if(r==0||r==mat.length-1)
				{
   					mat[r][c] = word.charAt(c);
   				}
   				else if(c==mat[r].length-r-1||c==r)
   				{
   					mat[r][c] = word.charAt(c);
   				}
   				else
				{
					mat[r][c] = ' ';
				}
			}



	}

	public String toString()
	{
		String output="";
		for(char[] c:mat)
		{
			for(char as : c)
				output+=as;
			output+="\n";
		}
		return output;
	}
}