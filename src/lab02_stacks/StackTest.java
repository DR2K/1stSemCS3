package lab02_stacks;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest
{
	private Stack<String> stack;

	public StackTest()
	{
		setStack("");
	}

	public void setStack(String line)
	{
		String[] vals=line.split(" ");
		for(String x:vals)
		{
			stack.push(x);
		}
	}
	
	public StackTest(String line)
	{
		stack = new Stack<String>();
		setStack(line);
	}
	

	public void popEmAll()
	{
		System.out.println("popping all items from the stack");
		while(!stack.empty())
		{
			System.out.print(stack.pop()+" ");
		}
		System.out.println();
	}
	
	public String toString()
	{
		String ret = "[ ";
		for(String x:stack)
		{
			ret+=x+", ";
		}
		ret = ret.substring(0,ret.length()-2);
		ret+="]";
		return ret;
	}
	//add a toString
}