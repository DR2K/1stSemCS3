package lab14_queues;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;
	private Queue<String> queue2;

	public PalinList()
	{
		queue = new LinkedList<>();
		queue2 = new LinkedList<>();
		stack = new Stack<>();
		setList("");
	}

	public PalinList(String list)
	{
		queue = new LinkedList<>();
		queue2 = new LinkedList<>();
		stack = new Stack<>();
		setList(list);
	}

	public void setList(String list)
	{
		queue.clear();
		stack.clear();
		queue2.clear();
		String[] s = list.split(" ");
		for(String x:s)
		{
			queue.add(x);
			queue2.add(x);
			stack.push(x);
		}
	}

	public boolean isPalin()
	{
		Queue<String> q= queue2;
		Stack<String> s= (Stack<String>)stack.clone(); 
		for(int x = 0;x<stack.size()/2;x++)
		{
			if(!q.remove().equals(s.pop()))
				return false;
		}
		return true;
	}

	public String toString()
	{
		if(isPalin())
			return stack.toString()+" is a palinlist";
		return stack.toString()+" is not a palinlist";
	}
}