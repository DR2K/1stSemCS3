package lab07_linkedlists.linkedlist3;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
		theList = new ListNode(null,null);
	}
	
	public void add(Comparable data)
	{
		if(theList.getValue()==null)
			theList.setValue(data);
		else
		{
			ListNode list = theList;
			while(list!=null){
				if (list.getNext()==null){
					list.setNext(new ListNode(data,null));
					list = list.getNext();
				}
				list = list.getNext();
			}

		}
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
   	int count=0;
   	ListNode list  = theList;
   	while(list!=null)
	{
		count++;
		list = list.getNext();
	}
   	return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		ListNode list = theList;
		list.setNext(new ListNode(list.getValue(), list.getNext()));
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		ListNode list = theList;
		while (list != null) {
			if (list.getNext() == null) {
				list.setNext(new ListNode(list.getValue(), null));
				break;
			}
			list = list.getNext();
		}
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{

	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		ListNode list = theList;
		int count = 1;
		while (list != null) {
			if (count % x == 0) {
				list.setValue(value);
			}
			count++;
			list = list.getNext();
		}
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
		ListNode list = theList;
		int count = 0;
		while (list.getNext() != null) {
			if (count % x == 0 && list.getNext().getNext() != null) {
				list.setNext(list.getNext().getNext());
				count--;
			} else if (count % x == 0 && list.getNext().getNext() == null) {
				list.setNext(null);
			}
			count++;
			if (list.getNext()!=null)
				list = list.getNext();
		}
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	ListNode list = theList;
   	String output="";
   	while(list!=null)
	{
		output+=list.getValue()+" ";
		list = list.getNext();
	}
   	return output;
   }			
	
}