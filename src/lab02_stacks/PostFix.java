package lab02_stacks;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack = new Stack<Double>();
	}

	public PostFix(String exp)
	{
		stack = new Stack<>();
		expression = exp;
	}

	public void setExpression(String exp)
	{
		expression = exp;
	}

	public double calc(double one, double two, char op)
	{
		if(op=='+') return one+two;
		if(op=='-') return two-one;
		if(op=='*') return one*two;
		return two/one;
	}

	public void solve()
	{
		char[] vals = expression.toCharArray();
		int ind = 0;
		while(ind<vals.length)
		{
			char next = vals[ind];
			if(next>=48&&next<=57)
				stack.push(Double.parseDouble(""+next));
			else if(next=='+'||next=='-'||next=='*'||next=='/')
			{
				stack.push(calc(stack.pop(),stack.pop(),next));
			}
			ind++;
		}
	}

	public String toString()
	{
		return expression +" = "+ stack.pop();
	}
}