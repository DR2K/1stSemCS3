package lab14_queues;
public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList test = new PalinList("one two three two one");
		System.out.println(test.toString());
		test.setList("1 2 3 4 5 one two three four five");
		System.out.println(test.toString());
		test.setList("a b c d e f g x y z g f h");
		System.out.println(test.toString());
		test.setList("racecar is racecar");
		System.out.println(test.toString());
		test.setList("1 2 3 a b c c b a 3 2 1");
		System.out.println(test.toString());
		test.setList("chicken is a chicken");
		System.out.println(test.toString());
	}
}