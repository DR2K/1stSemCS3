package lab02_stacks;

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		symbols = new Stack<Character>();
		exp = "";
	}

	public SyntaxChecker(String s)
	{
		symbols = new Stack<Character>();
		exp = s;
	}
	
	public void setExpression(String s)
	{
		exp = s;
	}

	public boolean checkExpression()
	{
		symbols.removeAllElements();
		char[] list = exp.toCharArray();
		for(char c:list)
		{
			char val = c;
			if(val == '['||val=='{'||val=='(')
				symbols.push(val);
			else if(val == ']'||val=='}'||val==')')
			{
				if(symbols.isEmpty())
					return false;
				else
				{
					char prevVal = symbols.pop();
					if(val==']'&&prevVal!='[')
						return false;
					else if(val=='}'&&prevVal!='{')
						return false;
					else if(val==')'&&prevVal!='(')
						return false;
				}
			}
		}
		if(!symbols.isEmpty())
			return false;
		return true;
	}

	public String toString()
	{
		if(checkExpression())
			return exp+" is correct.";
		else
			return exp+" is incorrect.";
			
	}
}