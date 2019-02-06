package lab14_queues;
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private PriorityQueue<String> pQueue;

	public PQTester()
	{
		pQueue = new PriorityQueue<>();
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue<>();
		setPQ(list);
	}

	public void setPQ(String list)
	{
		pQueue.clear();
		String[] s = list.split(" ");
		for(String x:s)
			pQueue.add(x);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
		{
			output+=pQueue.remove()+" ";
		}
		output = output.substring(0,output.length()-1);
		setPQ(output);
		return output;		
	}

	public String toString()
	{
		return pQueue.toString();
	}
}