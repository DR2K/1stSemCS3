package lab02_stacks;

import java.util.ArrayList;
import static java.lang.System.*;

public class IntStack
{
	private ArrayList<Integer> listOfInts;

	public IntStack()
	{
		listOfInts = new ArrayList<>();
	}

	public void push(int item)
	{
		listOfInts.add(item);
	}

	public int pop()
	{
		int val = listOfInts.get(listOfInts.size()-1);
		listOfInts.remove(listOfInts.size()-1);
		return val;
	}

	public boolean isEmpty()
	{
		if(listOfInts.size()==0)
			return true;
		return false;
	}

	public int peek()
	{
		return listOfInts.get(listOfInts.size()-1);
	}

	public String toString()
	{
		return listOfInts.toString();
	}
}