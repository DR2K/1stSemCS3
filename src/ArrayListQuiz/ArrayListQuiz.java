package ArrayListQuiz;

import java.util.*;
public class ArrayListQuiz
{
	public static void main (String args[])
	{
		ArrayList <String> sample = new ArrayList<String>();
		sample.add("Did");sample.add("you");sample.add("solve");sample.add("it");sample.add("or");sample.add("what?");
		//Complete the method removeEvens below
		System.out.println("\n"+sample);
		removeEvenLength(sample);
		System.out.println("Removing Strings of even length\n"+sample);

		//Complete the method maxLength
		sample.clear();
		System.out.println("\n"+sample);
		System.out.println("maxLength for an empty list is:  "+maxLength(sample));
		sample.add("to");sample.add("be");sample.add("or");	sample.add("not");sample.add("to");	sample.add("be");sample.add("hamlet");
	    System.out.println("\n"+sample);
		System.out.println("maxLength is:  "+maxLength(sample));
		sample.clear();
		sample.add("Only one really long string");
		System.out.println("\n"+sample);
		System.out.println("maxLength is:  "+maxLength(sample));

		sample.clear();

		// complete the method swapPairs
		sample.add("four");sample.add("score");sample.add("and");sample.add("seven");sample.add("years");sample.add("ago");
		System.out.println("\n"+sample);
		swapPairs(sample);
		System.out.println("\n\n after swapping pairs");
		System.out.println(sample);
		
		sample.clear();

		sample.add("how");sample.add("are");sample.add("you?");
		System.out.println("\n"+sample);
		stutter(sample,4);
		System.out.println("After a call to stutter\n");
		System.out.println(sample+"\n");

		sample.clear();
						
		sample.add("This");sample.add("is");sample.add("lots");
		sample.add("of");sample.add("fun");sample.add("for");
		sample.add("every");sample.add("java");sample.add("programmer");
		System.out.println("\n"+sample);
		markLength4(sample);
		System.out.println("After a call to markLength4\n");
		System.out.println(sample+"\n");

	}
	//Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and
	//that removes all of the strings of even length from the list.

	private static void  removeEvenLength(ArrayList<String> list)
	{
		for(int x= 0;x<list.size();x++)
			if(list.get(x).length()%2==0)
			{
				list.remove(x);
				x--;
			}
    }

   //Write a method maxLength that takes an ArrayList of Strings as a parameter and
   //that returns the length of the longest string in the list. If your method is passed an empty list, it should return 0.


	private static int maxLength(ArrayList <String> list)
	{
		if(list.size()==0)
			return 0;
		int max = list.get(0).length();
		for(int x=0;x<list.size();x++)
			if(list.get(x).length()>max)
				max=list.get(x).length();
		return max;
	
	}

	//Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
	// Your method should switch the order of the first two values, then switch the order of the next two,
	// switch the order of the next two, and so on.
	//For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"}
	// your method should switch the first pair, "four", "score", the second pair, "and", "seven",
	// and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}

	//If there are an odd number of values in the list, the final element is not moved.
	// For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"}It would again switch pairs
	// but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}

	private static void  swapPairs(ArrayList<String> list)
	{
		for(int x = 0;x<list.size();x+=2)
		{
			String temp = list.get(x);
			list.set(x,list.get(x+1));
			list.set(x+1,temp);
		}
    }
    
    
   //Complete the method stutter below. Stutter takes an ArrayList of Strings and an integer k as parameters
   //and that replaces every string with k copies of that string.
   //For example, if the list stores the values ["how", "are", "you?"]
   // before the method is called and k is 4
   //it should store the values ["how", "how", "how", "how", "are", "are", "are", "are", "you?", "you?", "you?", "you?"]
   // after the method finishes executing. If k is 0 or negative, the list should be empty after the call.

 	private static void  stutter(ArrayList<String> list, int k)
	{
		if(k<1)
			list.clear();
			
		for(int x = 0;x<list.size();x+=k)
		{
			for(int y=k;y>1;y--)
				list.add(x,list.get(x));
			
		}
			
    }
    //Write a method markLength4 that takes an ArrayList of Strings as a parameter and
	//that places a string of four asterisks "****" in front of every string of length 4.
	// For example, suppose that a variable called list contains the following values:
	// {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
	// And you make the following call: markLength4(list); then list should store the following values
	//after the call: {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}
	//Notice that you leave the original strings in the list, "this", "lots", "Java",
	// but include the four-asterisk string in front of each to mark it.

    private static void  markLength4(ArrayList<String> list)
	{
		for(int x = 0;x<list.size();x++)
			if(list.get(x).length()==4)
			{
				list.add(x,"****");
				x++;
			}
    }


}