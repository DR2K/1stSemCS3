package lab01_matrices;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab01b
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("lab01b.dat"));
		
		while(file.hasNext())
		{
	      String size = file.next();
		  FancyWord test = new FancyWord(size);
		  System.out.println(test);
	   }
	}
}