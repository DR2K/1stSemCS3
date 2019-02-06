package lab01_matrices;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Lab01c
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab01c.dat"));
	
		while(file.hasNext())
		{
	      int size = file.nextInt();
		  MagicSquare test = new MagicSquare (size);
		  test.createMagic();
		  System.out.println(test);



	   	}




	}
}