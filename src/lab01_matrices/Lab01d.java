package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.io.*;
import java.util.*;

public class Lab01d
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab01d.dat"));
	
		while(file.hasNext())
		{
	      int size = file.nextInt();
		  SpiralMatrix test = new SpiralMatrix (size);
		  test.createSpiral();
		  System.out.println(test);
	   	}



	}
}