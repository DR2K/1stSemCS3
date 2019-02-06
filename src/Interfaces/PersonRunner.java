package Interfaces;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;
import java.util.Arrays;

public class PersonRunner
{
	public static void main ( String[] args ) throws IOException
	{
	   Scanner file = new Scanner(new File("person.dat"));
	   int size = file.nextInt();
	   
	   Person[] per = new Person[size];
	   for(int x = 0;x<per.length;x++)
	   {
	   	per[x] = new Person(file.nextInt(),file.nextInt(),file.nextInt(),file.next());
	   }
	   Arrays.sort(per,Collections.reverseOrder());
	   System.out.println(Arrays.toString(per));
	}
}