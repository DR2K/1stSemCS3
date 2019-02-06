package lab05_iterators;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep)
	{
		toRemove = rem;
		String[] words  = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		replaceWith = rep;
	}

	public void setEmAll(String line, String rem, String rep)
	{
		toRemove = rem;
		String[] words  = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		replaceWith = rep;
	}

	public void replace()
	{
		ListIterator<String> iterate = list.listIterator();
		while(iterate.hasNext())
			if(iterate.next().equals(toRemove))
				iterate.set(replaceWith);
	}

	public String toString()
	{
		return list.toString()+"\n\n";
	}
}