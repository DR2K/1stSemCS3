package misc;//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

class Monster implements Comparable<Monster>
{
   int h,w,a;
   public Monster(int ht, int wt, int age){
   	h=ht;
   	w=wt;
   	a=age;
   }  
  
   public int getHeight(){
   	return h;
   }

   public boolean equals(Object o ){
   	if(this.getHeight()-((Monster)o).getHeight()==0) return true;
   	return false;
   }
    
   public int compareTo( Monster rhs ){
   	if(this.getHeight()!=rhs.getHeight())
   	return this.getHeight()-rhs.getHeight();
   	else if(this.w!=rhs.w)
   		return this.w-rhs.w;
   	else return this.a-rhs.a;
   }
   	
   public String toString( )  {
   	return h+" "+w+" "+a;
   }		
}

public class MonsterPQ  
{
	private Queue<Monster> pQueue;

	public MonsterPQ()
	{
		pQueue=new PriorityQueue<Monster>();
	}

	public void add(Monster obj)
	{
		pQueue.add(obj);
	}
	
	public Object getMin()
	{
		return pQueue.peek();
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
		 output+=pQueue.remove()+", ";	
		 	return output;	
	}

	public String toString(){
		return pQueue.toString();
	}
}