package lab07_linkedlists.linkedlist1;

import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		for(int x:list)
		total+=x;
		return total;
	}

	public double getAvg(  )
	{
		return getSum()/list.size();
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		for(int x: list)
		largest=Math.max(x, largest);
		return largest;
	}

	public int getSmallest()
	{
		int smallest = Integer.MAX_VALUE;
		for(int x: list)
			smallest=Math.min(x, smallest);
		return smallest;
	}

	public String toString()
	{
		String output="";
		output+="SUM:: "+getSum()+"\nAVERAGE:: "+getAvg()+"\nSMALLEST:: "+getSmallest()+"\nLARGEST:: "+getLargest()+"\n";
		return output;
	}
}