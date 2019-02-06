package lab05_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		toRemove = rem;
		String[] words  = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
	}

	public void setTest(String line, String rem)
	{
		toRemove = rem;
		String[] words  = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
	}

	public void remove()
	{
		Iterator<String> iterate = list.iterator();
		while(iterate.hasNext())
			if(iterate.next().equals(toRemove))
				iterate.remove();
	}

	public String toString()
	{
		return list.toString();
	}
}