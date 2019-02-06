package lab05_iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner
{
	public static void main ( String[] args )
	{
		IteratorRemover test = new IteratorRemover("a b c a b c a     a", "a");
		System.out.println(test);
		test.remove();
		System.out.println(test);
		test.setTest("a b c d e f g h i j x x x x     x","x");
		System.out.println(test);
		test.remove();
		System.out.println(test);
		test.setTest("1 2 3 4 5 6 a b c a b c     b","b");
		System.out.println(test);
		test.remove();
		System.out.println(test);
		
		/*
		 *
		 *a b c a b c a     a
		  a b c d e f g h i j x x x x     x
		  1 2 3 4 5 6 a b c a b c     b */

	}
}