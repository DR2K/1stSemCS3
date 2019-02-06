package lab14_queues;

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		PQTester test = new PQTester("one two three four five six seven");
		System.out.println(test.toString()+"\n"+test.getMin()+"\n"+test.getNaturalOrder());
		test.setPQ("1 2 3 4 5 one two three four five");
		System.out.println(test.toString()+"\n"+test.getMin()+"\n"+test.getNaturalOrder());
		test.setPQ("a p h j e f m c i d k l g n o b");
		System.out.println(test.toString()+"\n"+test.getMin()+"\n"+test.getNaturalOrder());

	}
}