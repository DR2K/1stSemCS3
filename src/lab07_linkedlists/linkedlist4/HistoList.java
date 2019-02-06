package lab07_linkedlists.linkedlist4;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		if (front==null)
			front = new HistoNode(let,1,null);
		else if(indexOf(let)==-1)
			front = new HistoNode(let,1,front);
		else
		{
			HistoNode temp = front;
			for(int x = 0;x<indexOf(let);x++)
				temp = temp.getNext();
			temp.setLetterCount(temp.getLetterCount()+1);
		}
	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		HistoNode temp = front;
		int ind = 0;
		while (temp!=null)
		{
			if(temp.getLetter()==let)
				return ind;
			ind++;
			temp=temp.getNext();
		}
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		HistoNode current=front;
		for (int x = 0;x<spot;x++)
			current = current.getNext();
		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		HistoNode temp = front;
		String output = "";
		while(temp!=null)
		{
			output+=temp.getLetter()+"-"+temp.getLetterCount()+" ";
			temp = temp.getNext();
		}
		return output;
	}
}