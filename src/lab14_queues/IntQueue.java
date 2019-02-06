//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

//ArrayList of ints
//or
//array of ints
package lab14_queues;
import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
		listOfInts = new ArrayList<>();
	}

	public void add(int item)
	{
		listOfInts.add(item);
	}

	public int remove()
	{
		int x= listOfInts.get(0);
		listOfInts.remove(0);
		return x;
	}

	public boolean isEmpty()
	{
		return listOfInts.isEmpty();
	}

	public int peek()
	{
		return listOfInts.get(0);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}