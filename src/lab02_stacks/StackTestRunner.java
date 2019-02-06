package lab02_stacks;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class StackTestRunner
{
	public static void main ( String[] args )
	{
		StackTest test = new StackTest("a b c d e f g h i");
		System.out.println(test.toString());
		test.popEmAll();
		test.setStack("1 2 3 4 5 6 7 8 9 10");
		System.out.println(test);
		test.popEmAll();
		test.setStack("# $ % ^ * ( ) ) _");
		System.out.println(test);
		test.popEmAll();
	}
}
